console.log ("Ja");

function empfaenger1( antwort ){
    console.log("Die Daten wurden empfangen");
    console.log(antwort);

    var json = antwort.json();
    return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(zahlung){  //return von empfänger1 wird an empänger 2 übergeben.
//	console.log(zahlung);
    console.log(zahlung.betrag);
    console.log(zahlung.empfaenger);
    console.log(zahlung.iban);
    console.log(zahlung.bic);
    console.log(zahlung.verwendungszweck);
    console.log(zahlung.datum);
    
    document.getElementById("betrag").value = zahlung.betrag;
    document.getElementById("empfaenger").value = zahlung.empfaenger;
    document.getElementById("iban").value = zahlung.iban;
    document.getElementById("bic").value = zahlung.bic;
    document.getElementById("verwendungszweck").value = zahlung.verwendungszweck;
    document.getElementById("datum").value = zahlung.datum;
}

function mit_suche_daten_abrufen (){
    //Eingabe
    var key = document.getElementById("eingabe").value;

    //Verarbeitung
    fetch("/zahlung/"+ key) //Url:was wird geholt
    .then(empfaenger1)             // was macht man damit: auspacken
    .then(empfaenger2);            // was macht man damit: ausgeben 
}

document.getElementById("suchestarten").addEventListener("click",mit_suche_daten_abrufen);
