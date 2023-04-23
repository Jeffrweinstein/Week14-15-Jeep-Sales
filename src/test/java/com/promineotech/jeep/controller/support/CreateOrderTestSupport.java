package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest{
  protected String createOrderBody() {
  return "{\n"
      + "  \"customer\":\"MORISON_LINA\",\n"
      + "  \"model\":\"WRANGLER\",\n"
      + "  \"trim\":\"Sport_Altitude\",\n"
      + "  \"doors\":2,\n"
      + "  \"color\":\"EXT_NACHO\",\n"
      + "  \"engine\":\"2_0_TURBO\",\n"
      + "  \"tire\":\"35_TOYO\",\n"
      + "  \"options\":[\n"
      + "    \"DOOR_QUAD_4\",\n"
      + "    \"EXT_AEV_LIFT\",\n"
      + "    \"EXT_WARN_WINCH\",\n"
      + "    \"EXT_WARN_BUMPER_FRONT\",\n"
      + "    \"EXT_WARN_BUMPER_REAR\",\n"
      + "    \"EXT_ARB_COMPRESSOR\"\n"
      + " ]\n"
      + "}";
  //formatter:on
    }
}