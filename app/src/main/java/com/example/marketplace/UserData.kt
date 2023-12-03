package com.example.marketplace

import com.google.gson.Gson

class UserList{
    val userList: List<UserData> = Gson().fromJson(users, Array<UserData>::class.java).asList()
    val avatarMap: MutableMap<Int, Int> = mutableMapOf()
    val userMap: MutableMap<String, Int> = mutableMapOf()

    init {
        avatarMap[0] = R.drawable.akshat
        avatarMap[1] = R.drawable.joseph
        avatarMap[2] = R.drawable.roselene
        avatarMap[3] = R.drawable.rayan
        avatarMap[4] = R.drawable.akshat
        avatarMap[5] = R.drawable.roselene

        userMap["eVbz3kWZELUOgtgcE1i2kho4MVh1"] = 0
        userMap["1az8S3bXN4fnNcuVesKrqh1E6rC3"] = 1
        userMap["4E0qedIm2EZU1pC6Nj3OsXYZSjQ2"] = 2
        userMap["f6atiTmG1pRqkW4LhLavy4LslLy1"] = 3
        userMap["MBsuFe4PkqSyvBm0rb2SHzMxH372"] = 4
        userMap["4E0qedIm2EZU1pC6Nj3OsXYZSjQ2"] = 5
    }
}

data class UserData(
    val id: Int,
    val name: String,
    val email: String,
    val password: String,
    val zip: String,
    val phone: String,
    val rating: Float,
    val status: String
)

val users = """
    [
        {
            "id": 0,
            "name": "akshat",
            "email": "akshat14@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "6175993771",
            "rating": 3.5,
            "status": "1"
            
        },
        {
            "id": 1,
            "name": "joseph",
            "email": "joseph@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 3.7,
            "status": "1"
        },
        {
            "id": 2,
            "name": "Roselene",
            "email": "winks@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 3.2,
            "status": "1"
        },
        {
            "id": 3,
            "name": "Rayan",
            "email": "ryed@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 4.3,
            "status": "1"
        },
        {
            "id": 4,
            "name": "akshat sahrma",
            "email": "akshat1.sunil@gmail.com",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 1.7,
            "status": "1"
        },
        {
            "id": 5,
            "name": "roselene",
            "email": "winks@bu.edu",
            "password": "123456",
            "zip": "02215",
            "phone": "123456789",
            "rating": 5,
            "status": "1"
        }
    ]
""".trimIndent()
