package is.hi.byrjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Byrjunarcontroller sem stýrir hvað er gert þegar notandi eða viðmót
 * setur inn skipun.
 * 
 * @author Ebba Þóra
 * @author Ragnheiður Ásta Karlsdóttir rak4@hi.is
 */

@Controller
@RequestMapping("/demo") // Request Mapping er gerð fyrir klasann til að slóðin byrji á /demo fyrir allar skipanir 
public class DemoController {


    /**
     * Birtir upphafssíðu forritsins.
     * @return skilar vísun í síðuna demo
     */
    @RequestMapping("/page")
    public String demoPage(){
        return "demo/demo";
    }
    
    /**
     * Birtir gefinn notanda.
     * @param model	heldur utan um hvaða notanda á að birta
     * @return	skilar vísun í síðuna synaNotandi
     */
    @RequestMapping("/notandi")
    public String notandi(Model model)
    {
    	model.addAttribute("nafn", "Heiða");
    	return "demo/synaNotandi";
    }
    
    /**
     * Spyr notanda um nafn og sendir hann áfram á síðu sem að birtir notanda kveðju.
     * @return	skilar vísun í síðuna hvadaNotandi
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi()
    {
    	return "demo/hvadaNotandi";
    }
    
    /**
     * Tekur nafn úr forminu og færir inn í nafnabreytuna þegar að kallað er í POST aðferðina.
     * @param nafn nafnið sem að skeytt er inn í módelið
     * @param model heldur utan um hvaða notanda á að birta
     * @return skilar vísun í síðuna synaNotandi
     */
    @RequestMapping(value="hver", method=RequestMethod.POST)
    public String hver(@RequestParam(value="nafn", required=false) String nafn, ModelMap model)
    {
    	model.addAttribute("nafn", nafn);
    	return "demo/synaNotandi";
    }
}
