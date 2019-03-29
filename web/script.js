window.onload = function() {
    
    var buttons = document.getElementsByTagName('input');
    for(i=0; i < buttons.length; i++) {
        buttons[i].addEventListener('click', itemAdded, false);
    }
    
    function itemAdded() {
        console.log(this.getAttribute('id'));
        var itemId = this.getAttribute('id');
        var xhr = new XMLHttpRequest();

        xhr.open('POST','http://localhost:8080/ITAccessories/cartServlet');
        xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
        xhr.send("itemId=" + itemId);

        xhr.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            document.getElementById("shoppingCart").innerHTML = this.responseText;
        }
    }
}
}
