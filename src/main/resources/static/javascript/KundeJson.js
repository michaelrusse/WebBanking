
 
function empfaenger1( antwort ){
    console.log("Die Daten wurden empfangen");
    console.log(antwort);

    var json = antwort.json();
    return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(kunde){  //return von empfänger1 wird an empfänger 2 übergeben.
//    console.log(zahlung);
    console.log(kunde.vorname);
    console.log(kunde.nachname);
    console.log(kunde.strasse);
    console.log(kunde.hausnummer);
    console.log(kunde.plz);
    console.log(kunde.ort);
    console.log(kunde.iban);
    
    document.getElementById("vorname").value = kunde.vorname;
    document.getElementById("nachname").value = kunde.nachname;
    document.getElementById("strasse").value = kunde.strasse;
    document.getElementById("hausnummer").value = kunde.hausnummer;
    document.getElementById("plz").value = kunde.plz;
    document.getElementById("ort").value = kunde.ort;
    document.getElementById("iban").value = kunde.iban;
}

function mit_suche_daten_abrufen (){
    //Eingabe
    var key = document.getElementById("eingabe").value;

    //Verarbeitung
    fetch("/kunde/" + key ) //Url:was wird geholt
    .then(empfaenger1)             // was macht man damit: auspacken
    .then(empfaenger2);            // was macht man damit: ausgeben 
}

document.getElementById("suchestarten").addEventListener("click",mit_suche_daten_abrufen);