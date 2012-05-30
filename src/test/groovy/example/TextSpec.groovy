package example

import spock.lang.*
import geb.*
import geb.spock.GebReportingSpec

class TextSpec extends GebReportingSpec {
	def setup() {
		to TextPage
	}

	@Unroll
	def 'text should be fetched'() {
		expect:
			$(selecter).text() == text
		where:
			selecter   | text
			'#content' | "I'm a p\nAnd I'm a div\nDoes this work?"
			'p'        | "I'm a p"
			'div'      | "And I'm a div"
			'textarea' | "Does this work?"
			'style'    | "body{background-color:yellow}"
			'title'    | "Text Fetching"
	}
}

class TextPage extends Page {
	static url = 'text.html'
}

