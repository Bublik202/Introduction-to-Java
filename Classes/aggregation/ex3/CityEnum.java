package aggregation.ex3;

public enum CityEnum {
	BREST, BARANAVICHY, PINSK, KOBRYN,
    BYAROZA, IVATSEVICHY, LUNINYETS, PRUZHANY,
    IVANAVA, DRAHICHYN, HANTSAVICHY, MIKASHEVICHY,
    BYELAAZYORSK, ZHABINKA, STOLIN, LYAKHAVICHY,
    MALARYTA, KAMYANYETS, DAVYD_HARADOK, VYSOKAYE,
    KOSAVA, TAMASOUKA,

    VITEBSK, ORSHA, NAVAPOLATSK, POLOTSK,
    PASTAVY, HLYBOKAYE, LEPEL, NOVALUKOML,
    HARADOK, BARAN, TALACYN, BRASLAU,
    CASNIKI, DUBROUNA, MIORY, SYANNO,
    BESHANKOVICHY, VERKHNYADZVINSK, DOKSHYTSY,
    USHACHYU, DISNA, SURAZ,

    GOMEL, MAZYR, ZHLOBIN, SVIETLAHORSK,
    RECHYTSA, KALINKAVICHY, RAHACHOW, DOBRUSH,
    ZHYTKAVICHY, KHOYNIKI, PIETRYKAW, YEL_SK,
    BUDA_KASHALYOVA, NAROULIA, VIETKA, CHACHERSK,
    VASILIEVICHY, BRAHIN, TUROV,

    GRODNO, LIDA, SLONIM, VAWKAVYSK,
    SMARHON, NAVAHRUDAK, ASHMYANY, MASTY,
    SHCHUCHYN, ASTRAVYETS, SKIDZIEL, BYAROZAWKA,
    IWYE, DZIATLAVA, ZELVA, KRASNASELSKI,
    KARELICHY, SVISLACH, VORANAVA, VYALIKAYA_BYERASTAVITSA,
    ROS,

    BARYSAW, SALIHORSK, MALADZYECHNA, SLUTSK,
    ZHODZINA, VILEYKA, DZYARZHYNSK, MARYINA_HORKA,
    STOWBTSY, NYASVIZH, SMALYAVICHY, ZASLAWYE,
    FANIPAL, BERAZINO, LYUBAN, STARYYA_DAROHI,
    VALOZHYN, LAHOYSK, KAPYL, KLETSK,
    CHERVYEN, UZDA, KRUPKI, MYADZYEL, MINSK,

    MOGILEV, BABRUYSK, ASIPOVICHY, HORKI,
    KRYCHAW, BYKHAW, KASTSYUKOVICHY, KLIMAVICHY,
    SHKLOW, MSTSISLAW, CHAVUSY, CHERYKAW,
    SLAWHARAD, KLICHAW;
	
	public DistrictEnum getDistrictEnum() {
	    switch (this) {
	        case BREST:
	        case TAMASOUKA:
	            return DistrictEnum.BREST_DISTRICT;
	        case BARANAVICHY:
	            return DistrictEnum.BARANAVICHY_DISTRICT;
	        case PINSK:
	            return DistrictEnum.PINSK_DISTRICT;
	        case KOBRYN:
	            return DistrictEnum.KOBRYN_DISTRICT;
	        case BYAROZA:
	        case BYELAAZYORSK:
	            return DistrictEnum.BYAROZA_DISTRICT;
	        case IVATSEVICHY:
	        case KOSAVA:
	            return DistrictEnum.IVATSEVICHY_DISTRICT;
	        case LUNINYETS:
	        case MIKASHEVICHY:
	            return DistrictEnum.LUNINYETS_DISTRICT;
	        case PRUZHANY:
	            return DistrictEnum.PRUZHANY_DISTRICT;
	        case IVANAVA:
	            return DistrictEnum.IVANAVA_DISTRICT;
	        case DRAHICHYN:
	            return DistrictEnum.DRAHICHYN_DISTRICT;
	        case HANTSAVICHY:
	            return DistrictEnum.HANTSAVICHY_DISTRICT;	        
	        case ZHABINKA:
	            return DistrictEnum.ZHABINKA_DISTRICT;
	        case STOLIN:
	        case DAVYD_HARADOK:
	            return DistrictEnum.STOLIN_DISTRICT;
	        case LYAKHAVICHY:
	            return DistrictEnum.LYAKHAVICHY_DISTRICT;
	        case MALARYTA:
	            return DistrictEnum.MALARYTA_DISTRICT;
	        case KAMYANYETS:
	            return DistrictEnum.KAMYANYETS_DISTRICT;
	        case VYSOKAYE:
	        	return DistrictEnum.VYSOKAYE_DISTRICT;
	    
	        case VITEBSK:
	        case SURAZ:
	            return DistrictEnum.VITEBSK_DISTRICT;
	        case ORSHA:
	        case BARAN:
	            return DistrictEnum.ORSHA_DISTRICT;
	        case NAVAPOLATSK:
	        case POLOTSK:
	            return DistrictEnum.POLOTSK_DISTRICT;
	        case PASTAVY:
	            return DistrictEnum.PASTAVY_DISTRICT;
	        case HLYBOKAYE:
	            return DistrictEnum.HLYBOKAYE_DISTRICT;
	        case LEPEL:
	            return DistrictEnum.LEPEL_DISTRICT;
	        case NOVALUKOML:
	        case CASNIKI:
	            return DistrictEnum.CASNIKI_DISTRICT;
	        case HARADOK:
	            return DistrictEnum.HARADOK_DISTRICT;
	        case TALACYN:
	            return DistrictEnum.TALACYN_DISTRICT;
	        case BRASLAU:
	            return DistrictEnum.BRASLAU_DISTRICT;
	        case DUBROUNA:
	            return DistrictEnum.DUBROUNA_DISTRICT;
	        case MIORY:
	        case DISNA:
	            return DistrictEnum.MIORY_DISTRICT;
	        case SYANNO:
	            return DistrictEnum.SYANNO_DISTRICT;
	        case BESHANKOVICHY:
	            return DistrictEnum.BESHANKOVICHY_DISTRICT;
	        case VERKHNYADZVINSK:
	            return DistrictEnum.VERKHNYADZVINSK_DISTRICT;
	        case DOKSHYTSY:
	            return DistrictEnum.DOKSHYTSY_DISTRICT;
	        case USHACHYU:
	            return DistrictEnum.USHACHYU_DISTRICT;

	        case GOMEL:
	            return DistrictEnum.GOMEL_DISTRICT;
	        case MAZYR:
	            return DistrictEnum.MAZYR_DISTRICT;
	        case ZHLOBIN:
	            return DistrictEnum.ZHLOBIN_DISTRICT;
	        case SVIETLAHORSK:
	            return DistrictEnum.SVIETLAHORSK_DISTRICT;
	        case RECHYTSA:
	        case VASILIEVICHY:
	            return DistrictEnum.RECHYTSA_DISTRICT;
	        case KALINKAVICHY:
	            return DistrictEnum.KALINKAVICHY_DISTRICT;
	        case RAHACHOW:
	            return DistrictEnum.RAHACHOW_DISTRICT;
	        case DOBRUSH:
	            return DistrictEnum.DOBRUSH_DISTRICT;
	        case ZHYTKAVICHY:
	        case TUROV:
	            return DistrictEnum.ZHYTKAVICHY_DISTRICT;
	        case KHOYNIKI:
	            return DistrictEnum.KHOYNIKI_DISTRICT;
	        case PIETRYKAW:
	            return DistrictEnum.PIETRYKAW_DISTRICT;
	        case YEL_SK:
	            return DistrictEnum.YEL_SK_DISTRICT;
	        case BUDA_KASHALYOVA:
	            return DistrictEnum.BUDA_KASHALYOVA_DISTRICT;
	        case NAROULIA:
	            return DistrictEnum.NAROULIA_DISTRICT;
	        case VIETKA:
	            return DistrictEnum.VIETKA_DISTRICT;
	        case CHACHERSK:
	            return DistrictEnum.CHACHERSK_DISTRICT;
	        case BRAHIN:
	            return DistrictEnum.BRAHIN_DISTRICT;

	        case GRODNO:
	        case SKIDZIEL:
	        case KRASNASELSKI:
	        case ROS:
	            return DistrictEnum.GRODNO_DISTRICT;
	        case LIDA:
	        case BYAROZAWKA:
	            return DistrictEnum.LIDA_DISTRICT;
	        case SLONIM:
	            return DistrictEnum.SLONIM_DISTRICT;
	        case VAWKAVYSK:
	            return DistrictEnum.VAWKAVYSK_DISTRICT;
	        case SMARHON:
	            return DistrictEnum.SMARHON_DISTRICT;
	        case NAVAHRUDAK:
	            return DistrictEnum.NAVAHRUDAK_DISTRICT;
	        case ASHMYANY:
	            return DistrictEnum.ASHMYANY_DISTRICT;
	        case MASTY:
	            return DistrictEnum.MASTY_DISTRICT;
	        case SHCHUCHYN:
	            return DistrictEnum.SHCHUCHYN_DISTRICT;
	        case ASTRAVYETS:
	            return DistrictEnum.ASTRAVYETS_DISTRICT;
	        case IWYE:
	            return DistrictEnum.IWYE_DISTRICT;
	        case DZIATLAVA:
	            return DistrictEnum.DZIATLAVA_DISTRICT;
	        case ZELVA:
	            return DistrictEnum.ZELVA_DISTRICT;
	        case KARELICHY:
	            return DistrictEnum.KARELICHY_DISTRICT;
	        case SVISLACH:
	            return DistrictEnum.SVISLACH_DISTRICT;
	        case VORANAVA:
	            return DistrictEnum.VORANAVA_DISTRICT;
	        case VYALIKAYA_BYERASTAVITSA:
	            return DistrictEnum.VYALIKAYA_BYERASTAVITSA_DISTRICT;
	        

	        case BARYSAW:
	            return DistrictEnum.BARYSAW_DISTRICT;
	        case SALIHORSK:
	            return DistrictEnum.SALIHORSK_DISTRICT;
	        case MALADZYECHNA:
	            return DistrictEnum.MALADZYECHNA_DISTRICT;
	        case SLUTSK:
	            return DistrictEnum.SLUTSK_DISTRICT;
	        case SMALYAVICHY:
	        case ZHODZINA:
	        case NYASVIZH:
	            return DistrictEnum.SMALYAVICHY_DISTRICT;
	        case VILEYKA:
	            return DistrictEnum.VILEYKA_DISTRICT;
	        case DZYARZHYNSK:
	        case FANIPAL:
	            return DistrictEnum.DZYARZHYNSK_DISTRICT;
	        case MARYINA_HORKA:
	            return DistrictEnum.MARYINA_HORKA_DISTRICT;
	        case STOWBTSY:
	            return DistrictEnum.STOWBTSY_DISTRICT;
	        case LYUBAN:
	            return DistrictEnum.LYUBAN_DISTRICT;
	        case STARYYA_DAROHI:
	            return DistrictEnum.STARYYA_DAROHI_DISTRICT;
	        case VALOZHYN:
	            return DistrictEnum.VALOZHYN_DISTRICT;
	        case LAHOYSK:
	            return DistrictEnum.LAHOYSK_DISTRICT;
	        case KAPYL:
	            return DistrictEnum.KAPYL_DISTRICT;
	        case KLETSK:
	            return DistrictEnum.KLETSK_DISTRICT;
	        case CHERVYEN:
	            return DistrictEnum.CHERVYEN_DISTRICT;
	        case UZDA:
	            return DistrictEnum.UZDA_DISTRICT;
	        case KRUPKI:
	            return DistrictEnum.KRUPKI_DISTRICT;
	        case MYADZYEL:
	            return DistrictEnum.MYADZYEL_DISTRICT;
	        case MINSK:
	        case ZASLAWYE:
	        case BERAZINO:
	            return DistrictEnum.MINSK_DISTRICT;

	        case MOGILEV:
	            return DistrictEnum.MOGILEV_DISTRICT;
	        case BABRUYSK:
	            return DistrictEnum.BABRUYSK_DISTRICT;
	        case ASIPOVICHY:
	            return DistrictEnum.ASIPOVICHY_DISTRICT;
	        case HORKI:
	            return DistrictEnum.HORKI_DISTRICT;
	        case KRYCHAW:
	            return DistrictEnum.KRYCHAW_DISTRICT;
	        case BYKHAW:
	            return DistrictEnum.BYKHAW_DISTRICT;
	        case KASTSYUKOVICHY:
	            return DistrictEnum.KASTSYUKOVICHY_DISTRICT;
	        case KLIMAVICHY:
	            return DistrictEnum.KLIMAVICHY_DISTRICT;
	        case SHKLOW:
	            return DistrictEnum.SHKLOW_DISTRICT;
	        case MSTSISLAW:
	            return DistrictEnum.MSTSISLAW_DISTRICT;
	        case CHAVUSY:
	            return DistrictEnum.CHAVUSY_DISTRICT;
	        case CHERYKAW:
	            return DistrictEnum.CHERYKAW_DISTRICT;
	        case SLAWHARAD:
	            return DistrictEnum.SLAWHARAD_DISTRICT;
	        case KLICHAW:
	            return DistrictEnum.KLICHAW_DISTRICT;
	        default:
	            throw new IllegalArgumentException("Unexpected value: " + this);
	    }
	}

}
