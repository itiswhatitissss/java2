function loginCheck(){
    if(document.frm.userid.value.length==0){
        alert("please insert id");
        frm.userid.focus();
        return false;
    }

    if(document.frm.pwd.value.length==""){
        alert("please insert pwd");
        frm.pwd.focus();
        return false;
    }

    return true;
}

function joinCheck(){

    if(document.frm.name.value.length==0){
        alert("please insert name");
        frm.userid.focus();
        return false;
    }

    if(document.frm.pwd.value.length==""){
        alert("please insert password");
        frm.userid.focus();
        return false;
    }

    if(document.frm.pwd.value != document.frm.pwd_check.value){
        alert("check your pwd");
        frm.pwd.focus();
        return false;
    }

}

function idCheck() {
    if(document.frm.userid.value==""){
        alert("아이디 입력하여 주세요");
        document.frm.userid.focus();
        return false;
    }

    var url="idCheck.do?userid="+document.frm.userid.value;
    window.open(url,"_blank_1","toolbar=no, menubar=no, scro;llbars=yes, resizable=no, width=450, height=200");

}

function idok(){
    opener.frm.userid.value=document.frm.userid.value;
    opener.frm.reid.value=document.frm.userid.value;
    self.close();
}