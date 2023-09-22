
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
        window.open("./")
    }

    else {
        window.alert(loginCredentials[name])
    }
}