package com.tutorial.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HomeController {
	
	@Autowired
	private AlienRepo aRepo;
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home method of controller");
		return "index";
	}
	
	@PostMapping("alien")
	public Alien saveAlien(@RequestBody Alien alien) {
	
		return aRepo.save(alien);
		
	}
	
	@GetMapping("/aliens")
	//@ResponseBody
	public List<Alien> getAliens() {
		return aRepo.findAll();
	}
	
	
	//@ResponseBody
	@GetMapping("/alien/{aid}")
	public Alien getAlien(@PathVariable("aid") int aId) {
		return aRepo.findById(aId).orElse(null);
	}
	
	
	
	
//	@RequestMapping("/add")
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//		
//		ModelAndView mv= new ModelAndView();
//		int k= i+j;
//	
//		mv.addObject("result", k);
//		mv.setViewName("output");
//	
//		return mv;
//	}
//	
//	@RequestMapping("/alien")
//	public String addAlien(@ModelAttribute Alien alien, Model model) { 
//		/*@RequestParam("aid") int aId, @RequestParam("aName") String aname
//		 * Alien alien = new Alien(); alien.setaId(aid); alien.setaName(aname);
//		 *  Model attribute mannually adds data to alien object from request. 
//		 * it already adds object in model so no need of ::
//		 * model.addAttribute("alien", alien);
//		 * @ModelAttribute("alien1")-- if you want to store obj with diff name in model.
//		 * @MA can be entirely removed but against convention.
//		 * 
//		 * 
//		 * Model Attribute at method level.
//		 * @ModelAttribute 				  ---this will be called first, so attribute set here will be in model always;
//		 * public void modelData(Model m){
//		 * 		m.addattribute("name", alien);
//		 * }
//		 * */
//		
//		
//		
//		
//		return "output";
//	}
//	
//	@GetMapping(path="/aliens")
//	public String getAliens(Model m) {
//		m.addAttribute("aliens", aRepo.findAll());
//		return "output";
//	}
//	
//	@GetMapping(path="/alien/name")
//	public String getAliens(@RequestParam("aName")  String aName, Model m) {
//		
//		m.addAttribute("aliens", aRepo.khojo(aName));
//		//m.addAttribute("aliens", aRepo.findByaName(aName));
//		
//		return "output";
//	}
//	
//	@GetMapping(path="/alien/id")
//	public String getAliens(@RequestParam("aId") int aId, Model m) {
//		
//		m.addAttribute("aliens", aRepo.findById(aId));
//			
//		return "output";
//	}
//	
//	@PostMapping(path="/alien")
//	public String saveAlien(@ModelAttribute Alien alien, Model m) {
//		
//		m.addAttribute("aliens", aRepo.save(alien));
//		return "output";
//	}
	
}
