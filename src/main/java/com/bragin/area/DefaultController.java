package com.bragin.area;

import com.bragin.area.model.core.RealtyUnit;
import com.bragin.area.model.persistence.RealtyUnitRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {
    @Autowired
    RealtyUnitRepository realtyUnitRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("nameParam", "Hallo welt!!");
        model.addAttribute("advert", new RealtyUnit());
		return "add_advert";
	}

    @RequestMapping(value = "/addAdvert", method = RequestMethod.POST)
    public String addAdvert(@ModelAttribute("RealtyUnit") RealtyUnit realtyUnit, BindingResult bindingResult) {
        realtyUnitRepository.save(realtyUnit);
        return "redirect:/";
    }

    @RequestMapping(value = "/api/adverts", method = RequestMethod.GET)
    public
    @ResponseBody
    String listAdvertsJson(ModelMap model) throws JSONException {
        JSONArray array = new JSONArray();
        for (RealtyUnit ru : realtyUnitRepository.findAll()) {
            JSONObject obj = new JSONObject();
            obj.put("name", ru.getName());
            array.put(obj);
        }
        return array.toString();
    }
}