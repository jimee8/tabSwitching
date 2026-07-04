const btnA = document.getElementById("btnA");
if (btnA) {
    btnA.addEventListener("click", function() {
        window.location.href = "http://localhost:8080/pageA.html";
    });
}

const btnB = document.getElementById("btnB");
if (btnB) {
    btnB.addEventListener("click", function() {
        window.location.href = "http://localhost:8080/pageB.html";
    });
}

const btnBS = document.getElementById("btnBS");
if (btnBS) {
    btnBS.addEventListener("click", function() {
        window.location.href = "http://localhost:8080/pageBS.html";
    });
}

const backBtn = document.getElementById("backBtn");
if (backBtn) {
    backBtn.addEventListener("click", function() {
        fetch("http://localhost:8080/reset", { method: "POST" })
        .then(() => {
            window.location.href = "http://localhost:8080/back";
        })
        .catch(error => {
            console.error("Error resetting counter on back navigation", error);
            window.location.href = "http://localhost:8080/back";
        });
    });
}

const generationBtn = document.getElementById("generateBtn");
if (generationBtn) {
    generationBtn.addEventListener("click", () => {
        fetch("http://localhost:8080/api/random")
        .then(response => response.text())
        .then(number => {
            document.getElementById("result").textContent = number;
        })
        .catch(error => {
            console.error("Error fetching data", error);
            document.getElementById("result").textContent = "Error";
        })
    })
}

const plusBtn = document.getElementById("plusBtn");
if (plusBtn) {
    plusBtn.addEventListener("click", () => {
        fetch("http://localhost:8080/increment", { method: "POST" })
        .then(response => response.text())
        .then(number => {
            document.getElementById("display").textContent = number;
        })
        .catch(error => {
            console.error("Error fetching data", error);
            document.getElementById("result").textContent = "Error";
        })
    })
}

const minusBtn = document.getElementById("minusBtn");
if (minusBtn) {
    minusBtn.addEventListener("click", () => {
        fetch("http://localhost:8080/decrement", { method: "POST" })
        .then(response => response.text())
        .then(number => {
            document.getElementById("display").textContent = number;
        })
        .catch(error => {
            console.error("Error fetching data", error);
            document.getElementById("result").textContent = "Error";
        })
    })
}

const resetBtn = document.getElementById("resetBtn");
if (resetBtn) {
    resetBtn.addEventListener("click", () => {
        fetch("http://localhost:8080/reset", { method: "POST" })
        .then(response => response.text())
        .then(number => {
            document.getElementById("display").textContent = number;
        })
        .catch(error => {
            console.error("Error fetching data", error);
            document.getElementById("result").textContent = "Error";
        })
    })
}

const sortBtnBS = document.getElementById("sortBtnBS");
if (sortBtnBS) {
    sortBtnBS.addEventListener("click", function(){
        fetch("http://localhost:8080/api/sortBS", {method: "POST"})
            .then(response => response.json())
            .then(numbers => {
                document.getElementById("originalArrayBS").textContent = numbers.originalArrayBS.join(", ");
                document.getElementById("sortArrayBS").textContent = numbers.sortedArrayBS.join(", ");
            })
            .catch(error => {
                console.error("Error fetching data", error);
                document.getElementById("sortArrayBS").textContent = "Error"
            })
    })
}

const display = document.getElementById("display");
if (display) {
    fetch("http://localhost:8080/display", { method: "POST" })
    .then(response => response.text())
    .then(number => {
        document.getElementById("display").textContent = number;
    })
    .catch(error => {
        console.error("Error fetching data", error);
        document.getElementById("result").textContent = "Error";
    })
}
