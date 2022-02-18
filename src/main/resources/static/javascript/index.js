console.log ("Ja");

function empfaenger1( antwort ){
    console.log("Die Daten wurden empfangen");
    console.log(antwort);

    var json = antwort.json();
    return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(zahlung){  //return von empfänger1 wird an empänger 2 übergeben.
//    console.log(zahlung);
    console.log(zahlung.Betrag);
    console.log(zahlung.Empfaenger);
    console.log(zahlung.Iban);
    console.log(zahlung.BIC);
    console.log(zahlung.Verwendungszweck);
    console.log(zahlung.Datum);
    
    document.getElementById("betrag").value = zahlung.Betrag;
    document.getElementById("empfaenger").value = zahlung.Empfaenger;
    document.getElementById("iban").value = zahlung.Iban;
    document.getElementById("bic").value = zahlung.BIC;
    document.getElementById("verwendungszweck").value = zahlung.Verwendungszweck;
    document.getElementById("datum").value = zahlung.Datum;
}

function mit_suche_daten_abrufen (){
    //Eingabe
    var key = document.getElementById("eingabe").value;

    //Verarbeitung
    fetch("json/zahlung.json?zahlungnummer="+ key) //Url:was wird geholt
    .then(empfaenger1)             // was macht man damit: auspacken
    .then(empfaenger2);            // was macht man damit: ausgeben 
}

document.getElementById("suchestarten").addEventListener("click",mit_suche_daten_abrufen);
