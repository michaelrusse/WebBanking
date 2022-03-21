console.log ("Ja");

function empfaenger1( antwort ){
    console.log("Die Daten wurden empfangen");
    console.log(antwort);

    var json = antwort.json();
    return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(zahlungen){  //return von empfänger1 wird an empänger 2 übergeben.
	console.log(zahlungen);
//    console.log(zahlung.betrag);
//    console.log(zahlung.empfaenger);
//    console.log(zahlung.entityIBAN.IBAN);
//    console.log(zahlung.entityIBAN.entityBIC.bic);
//    console.log(zahlung.verwendungszweck);
//    console.log(zahlung.datum);
    for (var zahlung in zahlungen){
	console.log(zahlungen[zahlung])
    document.getElementById("tabelleZahlungen").innerHTML =
    	document.getElementById("tabelleZahlungen").innerHTML
 		+ "<tr><td>"
 		+ zahlungen[zahlung].empfaenger
 		+ "</td><td>"
 		+ zahlungen[zahlung].betrag
 		+ "</td><td>"
 		+ zahlungen[zahlung].entityIBAN.iban
 		+ "</td><td>"
 		+ zahlungen[zahlung].entityIBAN.entityBIC.bic
 		+ "</td><td>"
 		+ zahlungen[zahlung].verwendungszweck
 		+"</td><td>"
 		+ zahlungen[zahlung].datum
 		+"</td></tr>" 
    }
}

function mit_suche_daten_abrufen (){
    //Eingabe
   // var key = document.getElementById("zahlungen").value;

    //Verarbeitung
    fetch("/zahlungen/") //Url:was wird geholt
    .then(empfaenger1)             // was macht man damit: auspacken
    .then(empfaenger2);            // was macht man damit: ausgeben 
}

mit_suche_daten_abrufen();
//document.getElementById("anzeigezahlungen").addEventListener("click",mit_suche_daten_abrufen);
