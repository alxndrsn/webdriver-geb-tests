package example

import spock.lang.*
import geb.*
import geb.spock.GebReportingSpec

class AttributeSpec extends GebReportingSpec {
	def setup() {
		to AttributePage
	}

	@Unroll
	def 'attributes should be fetched'() {
		expect:
			ellie."@$name" == value
		where:
			name       | value
			'missing'  | null
			'id'       | 'ellie'
			'style'    | 'color: red; '
			'class'    | 'normal thing'
			'invented' | 'ABC 123 four'
	}
}

class AttributePage extends Page {
	static url = 'attribute.html'
	static content = {
		ellie { $('#ellie') }
	}
}

