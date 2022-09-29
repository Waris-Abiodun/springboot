@Controller
class Example {
	@RequestMapping("/annotation")
	@ResponseBody
	public String hello() {
	"Hello Spring Boot, I am playing with different annotation"
	}
}
