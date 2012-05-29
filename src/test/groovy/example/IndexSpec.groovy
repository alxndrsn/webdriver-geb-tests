package example

import spock.lang.*
import geb.*
import geb.spock.GebReportingSpec

class IndexSpec extends GebReportingSpec {
	def setup() {
		to IndexPage
	}

	def cleanup() {
		println "InboxSpec.cleanup()"
	}

	def 'page HTML should not be null'() {
		expect:
			html
	}

	def 'page title should be INDEX'() {
		expect:
			title == 'Test Website'
	}

	def 'content div should be present'() {
		expect:
			contentContainer.displayed
	}

	def 'hidden content should not be reported displayed'() {
		expect:
			!hiddenDiv.displayed
	}
}

class IndexPage extends Page {
	static url = 'index.html'
	static content = {
		html { $() }
		title { $('title', 0).text() }
		contentContainer { $('#content') }
		hiddenDiv { $('#hiddenthing') }
	}
}

