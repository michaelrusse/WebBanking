

function empfaenger1(antwort) {
	console.log("Die Daten wurden empfangen");
	console.log(antwort);

	var json = antwort.json();
	return json;   //Übergabe in die fetch-funktion
}

function empfaenger2(kunde) {  //return von empfänger1 wird an empfänger 2 übergeben.
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

function mit_suche_daten_abrufen() {
	//Eingabe
	var key = document.getElementById("eingabe").value;

	//Verarbeitung
	fetch("/kunde/" + key) //Url:was wird geholt
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
	var url = "/kunde/";

	var vorname = document.getElementById("vorname").value; // statt "Paul" ... ?
	var nachname = document.getElementById("nachname").value;
	var strasse = document.getElementById("strasse").value;
	var hausnummer = document.getElementById("hausnummer").value;
	var plz = document.getElementById("plz").value;
	var ort = document.getElementById("ort").value;
	var iban = document.getElementById("iban").value;

	console.log(vorname);
	console.log(nachname);
	console.log(strasse);
	console.log(hausnummer);
	console.log(plz);
	console.log(ort);
	console.log(iban);

	var data = {
		vorname: vorname,
		nachname: nachname,
		strasse: strasse,
		hausnummer: hausnummer,
		plz: plz,
		ort: ort,
		iban: iban,
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
	fetch("/kunde/" + key,
		{
			//		headers: { "Content-Type": "application/json" },
			method: "DELETE", // "GET"
			//			body: key // Der body muss ein string sein,deshalb die Umwandlung 
		}).then(alert("Datensatz wurde gelöscht"));
};

function update(){
		
	var key = document.getElementById("eingabe").value;
	
	var vorname = document.getElementById("vorname").value; // statt "Paul" ... ?
	var nachname = document.getElementById("nachname").value;
	var strasse = document.getElementById("strasse").value;
	var hausnummer = document.getElementById("hausnummer").value;
	var plz = document.getElementById("plz").value;
	var ort = document.getElementById("ort").value;
	var iban = document.getElementById("iban").value;

	console.log(vorname);
	console.log(nachname);
	console.log(strasse);
	console.log(hausnummer);
	console.log(plz);
	console.log(ort);
	console.log(iban);

	var data = {
		vorname: vorname,
		nachname: nachname,
		strasse: strasse,
		hausnummer: hausnummer,
		plz: plz,
		ort: ort,
		iban: iban,
	};

	console.log(data);
	
	var datajson = JSON.stringify(data); // JSON-Object to String in var datajson ablegen

	console.log(datajson);
	fetch("/kunde/" + key,
	{
		headers: { "Content-Type": "application/json" },
			method: "PUT", // "GET"
			body: datajson // Der body muss ein string sein,deshalb die Umwandlung 
	}).then(alert("Datensatz wurde geändert"));
}
document.getElementById("suchestarten").addEventListener("click", mit_suche_daten_abrufen);
document.getElementById("absenden").addEventListener("click", verschicken);
document.getElementById("update").addEventListener("click", update);
document.getElementById("loeschen").addEventListener("click", loeschen);