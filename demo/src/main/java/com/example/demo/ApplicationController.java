package com.example.demo;

@RestController
@RequestMapping(value = "/application")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;
    @RequestMapping(value = "/get-image", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImagePath() throws IOException {
        ResponseEntity<byte[]> responseEntity = applicationService.getImageURL();
        return responseEntity;
    }
    @RequestMapping(value = "/get-text", method = RequestMethod.GET)
    public ResponseEntity<byte[]> getTextPath() throws IOException {
        ResponseEntity<byte[]> responseEntity = applicationService.getTextData();
        return responseEntity;
    }
}