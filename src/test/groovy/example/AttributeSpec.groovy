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

	@Unroll
	def 'attribute names that look like commands should be treated as attributes'() {
		expect:
			keywords."@$name" == name.reverse()
		where:
			name << ['async_script', 'attribute', 'back', 'cookie', 'element', 'elements', 'enabled', 'equals', 'execute', 'execute_async', 'forward', 'frame', 'implicit_wait', 'name', 'refresh', 'screenshot', 'session', 'source', 'status', 'submit', 'tag', 'text', 'timeouts', 'url', 'value', 'window', 'window_handle', 'window_handles']
	}
}

class AttributePage extends Page {
	static url = 'attribute.html'
	static content = {
		ellie { $('#ellie') }
		keywords { $('#keywords') }
	}
}

