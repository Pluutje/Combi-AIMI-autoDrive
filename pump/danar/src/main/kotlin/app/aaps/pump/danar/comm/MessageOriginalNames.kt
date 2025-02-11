package app.aaps.pump.danar.comm

object MessageOriginalNames {

    private var messageNames: HashMap<Int, String> = HashMap()

    fun getName(command: Int): String? {
        return if (messageNames.containsKey(command))
            messageNames[command]
        else
            throw IllegalStateException("Unknown command: " + String.format("%04X", command))
    }

    init {
        messageNames[0x3001] = "CMD_CONNECT"
        messageNames[0x3002] = "CMD_DISCONNECT"
        messageNames[0x3101] = "CMD_HISTORY_MEAL_INS"
        messageNames[0x3102] = "CMD_HISTORY_DAY_INS"
        messageNames[0x3103] = "CMD_HISTORY_AIR_SUB"
        messageNames[0x3104] = "CMD_HISTORY_GLUCOSE"
        messageNames[0x3105] = "CMD_HISTORY_ALARM"
        messageNames[0x3106] = "CMD_HISTORY_ERROR"
        messageNames[0x3107] = "CMD_HISTORY_CARBOHY"
        messageNames[0x3108] = "CMD_HISTORY_REFILL"
        messageNames[0x3109] = "CMD_HISTORY_SUSPEND"
        messageNames[0x310a] = "CMD_HISTORY_BASAL_HOUR"
        messageNames[0x310b] = "CMD_HISTORY_TB"
        messageNames[0x31f1] = "CMD_HISTORY_STOP"
        messageNames[0x31f2] = "CMD_HISTORY_LAST_T_R"
        messageNames[0x31f3] = "CMD_HISTORY_LAST_T_S"
        messageNames[0x0501] = "CMD_HISPAGE_MEAL_INS"
        messageNames[0x0502] = "CMD_HISPAGE_DAY_INS"
        messageNames[0x0503] = "CMD_HISPAGE_AIR_SUB"
        messageNames[0x0504] = "CMD_HISPAGE_GLUCOSE"
        messageNames[0x0505] = "CMD_HISPAGE_ALARM"
        messageNames[0x0506] = "CMD_HISPAGE_ERROR"
        messageNames[0x0507] = "CMD_HISPAGE_CARBOHY"
        messageNames[0x0508] = "CMD_HISPAGE_REFILL"
        messageNames[0x050a] = "CMD_HISPAGE_DAILTY_PRE_DATA"
        messageNames[0x050b] = "CMD_HISPAGE_BOLUS_AVG"
        messageNames[0x050c] = "CMD_HISPAGE_BASAL_RECORD"
        messageNames[0x050d] = "CMD_HISPAGE_TB"
        messageNames[0x3201] = "CMD_SETTING_V_MEAL_INS_I"
        messageNames[0x3202] = "CMD_SETTING_V_BASAL_INS_I"
        messageNames[0x3203] = "CMD_SETTING_V_MEAL_SETTING_I"
        messageNames[0x3204] = "CMD_SETTING_V_CCC_I"
        messageNames[0x3205] = "CMD_SETTING_V_MAX_VALUE_I"
        messageNames[0x3206] = "CMD_SETTING_V_BASAL_PROFILE_ALL"
        messageNames[0x3207] = "CMD_SETTING_V_SHIPPING_I"
        messageNames[0x3208] = "CMD_SETTING_V_CLOGGIN_SENS_I"
        messageNames[0x3209] = "CMD_SETTING_V_GLUCOSEandEASY"
        messageNames[0x320a] = "CMD_SETTING_V_TIME_I"
        messageNames[0x320b] = "CMD_SETTING_V_USER_OPTIONS"
        messageNames[0x320c] = "CMD_SETTING_V_PROFILE_NUMBER"
        messageNames[0x320d] = "CMD_SETTING_V_CIR_CF_VALUE"
        messageNames[0x3301] = "CMD_SETTING_MEAL_INS_S"
        messageNames[0x3302] = "CMD_SETTING_BASAL_INS_S"
        messageNames[0x3303] = "CMD_SETTING_MEAL_SETTING_S"
        messageNames[0x3304] = "CMD_SETTING_CCC_S"
        messageNames[0x3305] = "CMD_SETTING_MAX_VALUE_S"
        messageNames[0x3306] = "CMD_SETTING_BASAL_PROFILE_S"
        messageNames[0x3307] = "CMD_SETTING_SHIPPING_S"
        messageNames[0x3308] = "CMD_SETTING_CLOGGIN_SENS_S"
        messageNames[0x3309] = "CMD_SETTING_GLUCOSEandEASY_S"
        messageNames[0x330a] = "CMD_SETTING_TIME_S"
        messageNames[0x330b] = "CMD_SETTING_USER_OPTIONS_S"
        messageNames[0x330c] = "CMD_SETTING_PROFILE_NUMBER_S"
        messageNames[0x330d] = "CMD_SETTING_CIR_CF_VALUE_S"
        messageNames[0x0101] = "CMD_MEALINS_STOP"
        messageNames[0x0102] = "CMD_MEALINS_START_DATA"
        messageNames[0x0103] = "CMD_MEALINS_START_NODATA"
        messageNames[0x0104] = "CMD_MEALINS_START_DATA_SPEED"
        messageNames[0x0105] = "CMD_MEALINS_START_NODATA_SPEED"
        messageNames[0x0201] = "CMD_PUMP_ACT_INS_VALUE"
        messageNames[0x0202] = "CMD_PUMP_THIS_REMAINDER_MEAL_INS"
        messageNames[0x0203] = "CMD_PUMP_BASE_SET"
        messageNames[0x0204] = "CMD_PUMP_CALCULATION_SETTING"
        messageNames[0x0205] = "CMD_PUMP_EXERCISE_MODE"
        messageNames[0x0206] = "CMD_PUMP_MEAL_INS_I"
        messageNames[0x0207] = "CMD_PUMP_EXPANS_INS_I"
        messageNames[0x0208] = "CMD_PUMP_EXPANS_INS_RQ"
        messageNames[0x0209] = "CMD_PUMP_DUAL_INS_RQ"
        messageNames[0x020a] = "CMD_PUMP_INITVIEW_I"
        messageNames[0x020b] = "CMD_PUMP_STATUS"
        messageNames[0x020c] = "CMD_PUMP_CAR_N_CIR"
        messageNames[0x0301] = "CMD_PUMPINIT_TIME_INFO"
        messageNames[0x0302] = "CMD_PUMPINIT_BOLUS_INFO"
        messageNames[0x0303] = "CMD_PUMPINIT_INIT_INFO"
        messageNames[0x0304] = "CMD_PUMPINIT_OPTION"
        messageNames[0x0401] = "CMD_PUMPSET_EXERCISE_S"
        messageNames[0x0402] = "CMD_PUMPSET_HIS_S"
        messageNames[0x0403] = "CMD_PUMPSET_EXERCISE_STOP"
        messageNames[0x0404] = "CMD_PUMPSET_PAUSE"
        messageNames[0x0405] = "CMD_PUMPSET_PAUSE_STOP"
        messageNames[0x0406] = "CMD_PUMPSET_EXPANS_INS_STOP"
        messageNames[0x0407] = "CMD_PUMPSET_EXPANS_INS_S"
        messageNames[0x0408] = "CMD_PUMPSET_DUAL_S"
        messageNames[0x0409] = "CMD_PUMPSET_EASY_OFF"
        messageNames[0x0601] = "CMD_PUMPOWAY_SYSTEM_STATUS"
        messageNames[0x0602] = "CMD_PUMPOWAY_GLUCOSE_ALARM"
        messageNames[0x0603] = "CMD_PUMPOWAY_LOW_INSULIN_ALARM"
        messageNames[0x0610] = "CMD_PUMP_ALARM_TIEOUT"
        messageNames[0x0701] = "CMD_MSGRECEP_TAKE_SUGAR"
        messageNames[0x0702] = "CMD_MSGRECEP_GO_TO_DOCTOR"
        messageNames[0x0703] = "CMD_MSGRECEP_CALL_TO_CAREGIVER"
        messageNames[0x0704] = "CMD_MSGRECEP_CHECK_GLUCOSE_AGAIN"
        messageNames[0x0705] = "CMD_MSGRECEP_CALL_TO_HOME"
        messageNames[0x0706] = "CMD_MSGRECEP_DO_DELIVER"
        messageNames[0x0801] = "CMD_MSGSEND_YES_I_DO"
        messageNames[0x0802] = "CMD_MSGSEND_NO_I_CANNOT"
        messageNames[0x0803] = "CMD_MSGSEND_CALL_TO_ME_MOM"
        messageNames[0x0804] = "CMD_MSGSEND_DO_NOT_INFUSE"
        messageNames[0x0901] = "CMD_FILL_REFILL_COUNT"
        messageNames[0x0902] = "CMD_FILL_PRIME_CHECK"
        messageNames[0x0903] = "CMD_FILL_PRIME_END"
        messageNames[0x0904] = "CMD_FILL_PRIME_STOP"
        messageNames[0x0905] = "CMD_FILL_PRIME_PAUSE"
        messageNames[0x0906] = "CMD_FILL_PRIME_RATE"
        messageNames[0x41f2] = "CMD_HISTORY_ALL"
        messageNames[0x42f2] = "CMD_HISTORY_NEW"
        messageNames[0x41f1] = "CMD_HISTORY_ALL_DONE"
        messageNames[0x42f1] = "CMD_HISTORY_NEW_DONE"
        messageNames[0xF0F1] = "CMD_PUMP_CHECK_VALUE"
        messageNames[0xF0F2] = "CMD_PUMP_TIMECHANGE_CHECK"
        messageNames[0xF0F3] = "CMD_PUMP_TIMECHANGE_CLEAR"
        messageNames[0x43F2] = "CMD_HISTORY_DATEOVER_ALL"
        messageNames[0x4300] = "CMD_HISTORY_DATEOVER_DONE"
        messageNames[0xE001] = "CMD_PUMPSTATUS_APS"
        messageNames[0xE002] = "CMD_PUMPSET_APSTEMP"
        messageNames[0xE003] = "CMD_GET_HISTORY"
        messageNames[0xE004] = "CMD_SET_HISTORY_ENTRY"
    }
}