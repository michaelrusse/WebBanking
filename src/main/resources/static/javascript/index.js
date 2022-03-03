console.log("Ja");

function empfaenger1(antwort) {
	console.log("Die Daten wurden empfangen");
	console.log(antwort);

	var json = antwort.json();
	return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(zahlung) {  //return von empfänger1 wird an empänger 2 übergeben.
	//	console.log(zahlung);
	if (zahlung == null) {
		alert("Diese ID gibt es nicht in der Datenbank")
	}

	else {
		console.log(zahlung.betrag);
		console.log(zahlung.empfaenger);
		console.log(zahlung.entityIBAN.iban);
		console.log(zahlung.entityIBAN.entityBIC.bic);
		console.log(zahlung.verwendungszweck);
		console.log(zahlung.datum);

		document.getElementById("betrag").value = zahlung.betrag;
		document.getElementById("empfaenger").value = zahlung.empfaenger;
		document.getElementById("iban").value = zahlung.entityIBAN.iban;
		document.getElementById("bic").value = zahlung.entityIBAN.entityBIC.bic;
		document.getElementById("verwendungszweck").value = zahlung.verwendungszweck;
		document.getElementById("datum").value = zahlung.datum;
	}
}

function mit_suche_daten_abrufen() {
	//Eingabe
	var key = document.getElementById("eingabe").value;

	//Verarbeitung
	fetch("/zahlung/" + key) //Url:was wird geholt
		.then(empfaenger1)             // was macht man damit: auspacken
		.then(empfaenger2);            // was macht man damit: ausgeben 
}

function verschicken() {

	// URL:
	// http(s): Hypertext Transfer Protocol (s=secure)
	// ://
	// host: Gastgeber - ein Computer im Netzwerk
	// port: 80, 8000 - Nebenstelle
	// pfad/auf/eine - Verzeichnis
	// datei - "Der Endpunkt"
	//
	var url = "/zahlung/";

	var empfaenger = document.getElementById("empfaenger").value; // statt "Paul" ... ?
	var betrag = document.getElementById("betrag").value;
	var iban = document.getElementById("iban").value;
	var bic = document.getElementById("bic").value;
	var verwendungszweck = document.getElementById("verwendungszweck").value;
	var datum = document.getElementById("datum").value;

	console.log(empfaenger);
	console.log(betrag);
	console.log(iban);
	console.log(bic);
	console.log(verwendungszweck);
	console.log(datum);

	var data = {
		empfaenger: empfaenger,
		betrag: betrag,
		iban: iban,
		bic: bic,
		verwendungszweck: verwendungszweck,
		datum: datum,
	};



	console.log(data);

	var datajson = JSON.stringify(data); // JSON-Object to String in var datajson ablegen

	console.log(datajson);

	// Verschicken der Daten
	fetch(url,
		{
			headers: { "Content-Type": "application/json" },
			method: "POST", // "GET"
			body: datajson // Der body muss ein string sein,deshalb die Umwandlung 
		}
	).then(alert("Datensatz wurde angelegt"));
}

function loeschen() {
	var key = document.getElementById("eingabe").value;
	//Verarbeitung
	fetch("/zahlung/" + key,
		{
			//		headers: { "Content-Type": "application/json" },
			method: "DELETE", // "GET"
			//			body: key // Der body muss ein string sein,deshalb die Umwandlung 
		}).then(alert("Datensatz wurde gelöscht"));


}

function update() {

	var key = document.getElementById("eingabe").value;

	var empfaenger = document.getElementById("empfaenger").value; // statt "Paul" ... ?
	var betrag = document.getElementById("betrag").value;
	var iban = document.getElementById("iban").value;
	var bic = document.getElementById("bic").value;
	var verwendungszweck = document.getElementById("verwendungszweck").value;
	var datum = document.getElementById("datum").value;

	var data = {
		id: key,
		empfaenger: empfaenger,
		betrag: betrag,
		iban: iban,
		bic: bic,
		verwendungszweck: verwendungszweck,
		datum: datum,
	};

	console.log(data);

	var datajson = JSON.stringify(data); // JSON-Object to String in var datajson ablegen

	console.log(datajson);
	fetch("/zahlung/" + key,
		{
			headers: { "Content-Type": "application/json" },
			method: "PUT", // "GET"
			body: datajson // Der body muss ein string sein,deshalb die Umwandlung 
		}).then(alert("Datensatz wurde geändert"));
}

//function gutenTag (){
//	alert("Diese Seite verwendet Cookies. Bitte bestätigen Sie den Erhalt)")
//};

//gutenTag();
document.getElementById("suchestarten").addEventListener("click", mit_suche_daten_abrufen);
document.getElementById("absenden").addEventListener("click", verschicken);
document.getElementById("update").addEventListener("click", update);
document.getElementById("loeschen").addEventListener("click", loeschen);