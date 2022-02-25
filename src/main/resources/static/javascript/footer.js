function DatumUhrzeit() {

var date = new (Date);

document.write(
	date.getDate() +
	'.' +
	(date.getMonth() + 1) +
	'.' +
	(date.getYear() + 1900)
);
};
