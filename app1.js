
// names ans password
const loginCredentials = {
    "julie": "iamjulie",
    "sanders": "kfc",
    "login-bot": "not-a-bot"
}


function checkCredentials() {
    let name = document.forms["login-form"]["username"].value
    let password = document.forms["login-form"]["password"].value

    console.log(name)
    console.log(password)

    // console.log(loginCredentials[name])
    if (loginCredentials[name] != undefined) {
        window.alert(true)
<<<<<<< HEAD
        window.open("./success.html")
        location.assign("https://www.google.com")
=======
        window.open("./404.html")
>>>>>>> new_local
    }

    else {
        window.alert(loginCredentials[name])
    }
}