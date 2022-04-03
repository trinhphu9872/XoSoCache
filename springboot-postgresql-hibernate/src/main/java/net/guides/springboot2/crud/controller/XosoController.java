package net.guides.springboot2.crud.controller;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.logging.Log;
import net.guides.springboot2.crud.model.Xoso;
import net.guides.springboot2.crud.repository.XososRepository;



@EnableCaching
@RestController
@RequestMapping("apiXoSo")
public class XosoController {
	@Autowired
	private XososRepository xososRepository;
//	GetData Cache
	@Cacheable("xosoCache")
	@GetMapping("/xoso")
	public List<Xoso> getAllXoso() {
		return xososRepository.findAll();
	}
//	Clear Cache
	@CacheEvict(value = "xosoCache", allEntries = true)
	@GetMapping("/xoaCache")
	public void evictAllCacheValues() {
		log.info("xóa cache");
	}
//	log
	private static final Log log = LogFactory.getLog(XosoController.class);
}
