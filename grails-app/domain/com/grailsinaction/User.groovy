package com.grailsinaction

class User {

  String loginId
  String password
  Date dateCreated

  static hasOne = [profile: Profile]

  static hasMany = [posts: Post, tags: Tag, following: User]

  static constraints = {
    loginId size:3..20, unique: true //, matches: '[0-9]{7}[A-Za-z]'
    password size: 6..8, validator: { passwd, user ->
      return passwd != user.loginId
    }
    profile nullable: true
  }

}
