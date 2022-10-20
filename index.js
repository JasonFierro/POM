const report = require('multiple-cucumber-html-reporter');

report.generate({
	jsonDir: './report/test/',
	reportPath: './report/test/',
	openReportInBrowser: true,
	disableLog: false,
	pageTitle: "Reports Prixz",

	metadata:{
        browser: {
            name: 'chrome',
            version: '60'
        },
        device: 'Local test machine',
        platform: {
            name: 'ubuntu',
            version: '16.04'
        }
    },
    customData: {
        title: 'Run info',
        data: [
            {label: 'Project', value: 'Prixz project'},
            {label: 'Release', value: '1.0'},
            {label: 'Cycle', value: '1.0'},
            {label: 'Execution Start Time', value: date = new Date().toUTCString()},
            {label: 'Execution End Time', value: date = new Date().toUTCString()}
        ]
    }
});