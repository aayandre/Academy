function init() {
    
    let clickedButton = localStorage.getItem("clickedButton")
    
    if(clickedButton != null) {
        document.getElementById(clickedButton).classList.add("activated")
    }
    
    document.querySelectorAll(".button").forEach(element => {
        
        element.addEventListener("click",  function(){
            
            localStorage.setItem("clickedButton", element.id)
            
            clickedButton = localStorage.getItem("clickedButton")
            
            window.location = clickedButton + ".html"
            
        })
    });
    
    document.querySelector("#localStorageCleaner").addEventListener("click", function(){
        localStorage.clear()
    })

}