console.log ("Ja");

function empfaenger1( antwort ){
    console.log("Die Daten wurden empfangen");
    console.log(antwort);

    var json = antwort.json();
    return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(kunden){  //return von empfänger1 wird an empänger 2 übergeben.
	console.log(kunden);
//    console.log(zahlung.betrag);
//    console.log(zahlung.empfaenger);
//    console.log(zahlung.iban);
//    console.log(zahlung.bic);
//    console.log(zahlung.verwendungszweck);
//    console.log(zahlung.datum);
    for (var kunde in kunden){
	console.log(kunden[kunde])
    document.getElementById("tabelleKunden").innerHTML =
    	document.getElementById("tabelleKunden").innerHTML
 		+ "<tr><td>"
 		+ kunden[kunde].vorname
 		+ "</td><td>"
 		+ kunden[kunde].nachname
 		+ "</td><td>"
 		+ kunden[kunde].strasse
 		+ "</td><td>"
 		+ kunden[kunde].hausnummer
 		+ "</td><td>"
 		+ kunden[kunde].plz
 		+"</td><td>"
 		+ kunden[kunde].ort
 		+"</td><td>"
 		+ kunden[kunde].iban
 		+"</td></tr>" 
    }
}

function mit_suche_daten_abrufen (){
    //Eingabe
   // var key = document.getElementById("zahlungen").value;

    //Verarbeitung
    fetch("/kunden/") //Url:was wird geholt
    .then(empfaenger1)             // was macht man damit: auspacken
    .then(empfaenger2);            // was macht man damit: ausgeben 
}

mit_suche_daten_abrufen();
//document.getElementById("anzeigezahlungen").addEventListener("click",mit_suche_daten_abrufen);
