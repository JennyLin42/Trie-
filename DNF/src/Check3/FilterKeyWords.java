package Check3;

import java.io.Reader;

/// <summary>
/// Ãô¸Ð´Ê¹ýÂË ÒÑºöÂÔ´óÐ¡Ð´ È«°ë½Ç ¼ò·±Ìå²îÒì ÌØÊâ·ûºÅ  html±êÇ© ¸ÉÈÅ
/// </summary>
public class FilterKeyWords
{
    private final String TraditionalChinese = "°}Ì@µKÛÂOÒ\ŠW‰ÎÁT”[”¡îCÞk½OŽÍ½‰æ^Ör„ƒï–ŒšˆóõUÝ…Øä^ªN‚ä‘v¿‡¹P®…”Àé]ß…¾ŽÙH×ƒÞqÞpü‚°TžlžIÙe”Pïž“ÜÀãKñgÊNÑa…¢ÐQšˆ‘M‘K NÉnÅ“‚}œæŽú‚ÈƒÔœyŒÓÔŒ”v“½Ïsð’×‹ÀpçP®bêUîˆö‡LéLƒ”ÄcS•³ânÜ‡Ø‰mêÒr“Î·Q‘ÍÕ\òG°VßtñYuýXŸë›_ÏxŒ™® ÜP»I¾Iáh™»NäzërµAƒ¦Ó|ÌŽ‚÷¯êJ„“åN¼ƒ¾bÞoÔ~ÙnÂ”Ê[‡èÄ…²œ¸Zåeß_Ž§ÙJ“ú†Îà“ÛÄ‘‘„ÕQ—®”“õühÊŽ™n“vu¶\Œ§±IŸôà‡”³œìßf¾†üc‰|ëŠÕážÕ{µþÕ™¯Bá”í”åVÓ†–|„Ó—ƒöôY Ùªš×xÙ€åƒå‘”à¾„ƒ¶ê Œ¦‡îDâgŠZùZî~ÓžºðIƒº –ðDÙE°lÁPéy¬mµ\âCŸ©¹ ØœïˆÔL¼ïwUÙM¼Š‰žŠ^‘¼SØS—÷ähïL¯‚ñT¿pÖSøPÄwÝ—“áÝoÙxÑ}Ø“Ó‡‹D¿`Ô“â}ÉwŽÖÚs¶’ÚMŒù„‚ä“¾VÅVæ€”Røéwãt‚€½oýŒmì–Ø•âhœÏ˜‹Ù‰òÐMî™„ŽêPÓ^ð^‘TØžVÒŽÎùšwý”é|Ü‰ÔŽ™™ÙF„£ÝLå‡øß^ñ”ínhéuúQÙR™MÞZø™¼táá‰Ø×oœû‘ô‡WÈA®‹„Ô’‘Ñ‰Äšg­hß€¾“Q†¾¯ˆŸ¨œoüSÖe“]Ýxš§ÙV·x•þ Z¡ÖMÕdÀLÈœ†â·«@Ø›µœ“ô™C·eð‡×Iëu¿ƒ¾ƒ˜OÝ‹¼‰”DŽ×ËE„©úÓ‹Ó›ëHÀ^¼oŠAÇvîaÙZâ›ƒrñ{šž±OˆÔ¹{égÆD¾}ÀO™z‰Aû|’þ“ìº†ƒ€œpË]™‘èbÛ`ÙvÒŠæIÅž„¦ðTužR¾{ÊY˜ªª„ÖváuÄz²òœ‹É”‡ãq³CƒeÄ_ïœÀU½gÞIÝ^·MëA¹Çoó@½›îiìoçR½¯d¸‚œQ¼mŽýÅfñxÅe“þä‘Ö„¡ùN½‚Ü½YÕ]ŒÃ¾oå\ƒHÖ”ßM•x a±M„ÅÇGÓX›QÔE½^âxÜŠòEé_„Pîwš¤Õn‰¨‘©“¸ŽìÑÕF‰Kƒ~Œ’µV•ç›rÌŽh¸Qð¢”UéŸÏžÅDÈRíÙ‡Ë{™Ú”r»@ê@Ìmž‘×Ž”ˆÓ[‘ÐÀ| €žE“Æ„Ú³˜·èD‰¾îœI»hëxÑYõŽ¶Yû…–„îµ[•Ñžrë`‚zÂ“ÉßBç ‘ziºŸ”¿Ä˜æœ‘ÙŸ’¾š¼Z›öƒÉÝvÕ¯Ÿß|ç‚«CÅRà÷[„CÙUýgâœRì`ŽXîIðs„¢ýˆÃ@‡µ»\‰Å”në]˜ÇŠä“§ºtÌJ±RïB] t“ïûuÌ”ô”ÙTµ“ä›ê‘óH…ÎäX‚HŒÒ¿|‘]žV¾GŽn”Œ\ž´y’àÝ†‚öœS¾]Õ“Ì}Á_ß‰èŒ»jò…ñ˜½j‹Œ¬”´aÎ›ñRÁR†áÙIûœÙuß~Ã}²mðzÐUMÖ™Øˆå^ãTÙQ÷áüq›]æVéTž‚ƒåi‰ôÖi›Ò’¾d¾’Rœç‘‘é}øQã‘Ö‡Ö\®€âc¼{ëy“ÏÄXÀô[ðHÄ”f“Óá„øBÂ™ýmè‡æ‡™ŽªŸå¸”Qôâo¼~Ä“âÞr¯‘ÖZšWútšª‡Ia±Pý‹Ùr‡Šùiò_ïhîlØšÌO‘{ÔuŠîH“ää˜ã×VÄšýRòTØM†™šâ—‰Ó™ ¿’LâTãUßwºžÖtåXãQ“œ\×l‰q˜Œ†Ü ËNŠ“Œæ@˜ò†ÌƒSÂN¸[¸`šJÓHÝpšäƒAí•Õˆ‘c­‚¸FÚ……^Ü|òŒýxïE™à„ñ…sùo×Œðˆ”_À@ŸáígÕJ¼x˜s½qÜ›äJéc™ž¢Ë_öwÙ‚ã†Êò}’ß­š¢¼†ºY•ñéWê„Ù ¿˜‚ûÙpŸý½BÙd”z‘ØÔO¼Œ‹ðÄIBÂ•ÀK„ÙÂ}ŽŸª{ñÔŠŒÆ•rÎgŒ×Rñ‚„ÝáŒï—Ò•Ô‡‰Û«F˜ÐÝ”•øÚHŒÙÐg˜äØQ”µŽ›ëpÕl¶í˜Õf´T q½zï•Â–‘ZížÔAÕb”\ÌKÔVÃCëm½—šqŒO“p¹S¿s¬æi«H“é”E”‚Ø°cž©‰¯×TÕ„šUœ« Cý¿lòvÖ`äRî}ówŒÏ—lÙNèFdÂ ŸNã~½yî^ˆD‰TˆFîjÍ‘Ã“ørñWñ„™E¸DÒmž³îBÈf¾Wífß`‡ú ‘žH¾SÈ”‚¥ƒ^¾•Ö^ÐlœØÂ„¼y·€†–®Y“ëÎœu¸C†èæužõÕ_ŸoÊ…Ç‰]ìF„ÕÕ`åa ÞÒuÁ•ãŠ‘ò¼šÎrÝ {‚bªMBåvõrÀwûyÙtã•éeï@ëU¬F«I¿hðWÁw‘—¾€Žûè‚àlÔ”í‘í—Ê’äN•Ô‡[Ï…f’¶”yÃ{ÖCŒ‘žaÖxä\á…Åd›°çnÀCÌ“‡uíšÔS¾wÀmÜŽ‘Òßx°_½kŒW„ìÔƒŒ¤ñZÓ–Óßd‰ºøfø††¡†Ó éŽŸŸû}‡Àî†éØW…’³Ž©ÖVòžø„—î“P¯ƒê–°WðB˜Ó¬Ž“uˆòßb¸GÖ{ËŽ ”í“˜IÈ~átãžîUßzƒx¤ÏË‡ƒ|‘›ÁxÔ„×hÕx×g®À[ÊaêŽãyï‹™Ñ‹ëú—‘ªÀt¬“Îž IŸÉÏ‰·f†Ñ“í‚ò°bÛxÔœ¥ƒž‘nà]â™ªqß[ÕTÝ›ô~OŠÊÅcŽZÕZ»n¶Rªz×uîAñSøxœYÞ@ˆ@†TˆA¾‰ßhîŠ¼sÜSè€Ž[»›‚é†ë…ày„òëEß\ÌNáj•žíësžÄÝd”€•ºÙÚEóvè——¸^ØŸ“ñ„tÉÙ\Ù›¼™„žÜˆåŽélÔpýS‚ùšÖ±K”ØÝšä—£‘ð¾`ˆqŽ¤Ù~Ã›ÚwÏUÞHæNß@Ø‘á˜‚ÉÔ\æ‚ê‡’ê± ªbŽ¬à×C¿—ÂšˆÌ¼ˆ“´”SŽÃÙ|æR½K·NÄ[Ð\ÖaÝS°™•ƒóEØiÖTÕD T²š‡ÚÙAèTºBñvŒ£´uÞDÙ˜¶ÇfÑbŠy‰Ñ îåFÙ˜‰‹¾YÕáÆÙYnÛ™¾C¿‚¿vàuÔ{½Mè¿@çŠüNžéëbƒ´œÊ†¢é›ÑeìZðNå€›ª";
    private final String SimplifiedChinese = "°¨°ª°­°®°¿°À°Â°Ó°Õ°Ú°Ü°ä°ì°í°ï°ó°÷°ù°þ±¥±¦±¨±«±²±´±µ±·±¸±¹±Á±Ê±Ï±Ð±Õ±ß±à±á±ä±ç±è±î±ñ±ô±õ±ö±÷±ý²¦²§²¬²µ²·²¹²Î²Ï²Ð²Ñ²Ò²Ó²Ô²Õ²Ö²×²Þ²à²á²â²ã²ï²ó²ô²õ²ö²÷²ø²ù²ú²û²ü³¡³¢³¤³¥³¦³§³©³®³µ³¹³¾³Â³Ä³Å³Æ³Í³Ï³Ò³Õ³Ù³Û³Ü³Ý³ã³å³æ³è³ë³ì³ï³ñ³ó³÷³ø³ú³û´¡´¢´¥´¦´«´¯´³´´´¸´¿´Â´Ç´Ê´Í´Ï´Ð´Ñ´Ó´Ô´Õ´Ü´í´ï´ø´ûµ£µ¥µ¦µ§µ¨µ¬µ®µ¯µ±µ²µ³µ´µµµ·µºµ»µ¼µÁµÆµËµÐµÓµÝµÞµãµæµçµíµöµ÷µüµýµþ¶¤¶¥¶§¶©¶«¶¯¶°¶³¶·¶¿¶À¶Á¶Ä¶Æ¶Í¶Ï¶Ð¶Ò¶Ó¶Ô¶Ö¶Ù¶Û¶á¶ì¶î¶ï¶ñ¶ö¶ù¶û¶ü·¡·¢·£·§·©·¯·°·³·¶···¹·Ã·Ä·É·Ï·Ñ·×·Ø·Ü·ß·à·á·ã·æ·ç·è·ë·ì·í·ï·ô·ø¸§¸¨¸³¸´¸º¸¼¸¾¸¿¸Ã¸Æ¸Ç¸É¸Ï¸Ñ¸Ó¸Ô¸Õ¸Ö¸Ù¸Ú¸Þ¸ä¸é¸ë¸ó¸õ¸ö¸ø¹¨¹¬¹®¹±¹³¹µ¹¹¹º¹»¹Æ¹Ë¹Ð¹Ø¹Û¹Ý¹ß¹á¹ã¹æ¹è¹é¹ê¹ë¹ì¹î¹ñ¹ó¹ô¹õ¹ö¹ø¹ú¹ýº§º«ºººÒº×ºØºáºäºèºìºóºø»¤»¦»§»©»ª»­»®»°»³»µ»¶»·»¹»º»»»½»¾»À»Á»Æ»Ñ»Ó»Ô»Ù»ß»à»á»â»ã»ä»å»æ»ç»ë»ï»ñ»õ»ö»÷»ú»ý¼¢¼¥¼¦¼¨¼©¼«¼­¼¶¼·¼¸¼»¼Á¼Ã¼Æ¼Ç¼Ê¼Ì¼Í¼Ð¼Ô¼Õ¼Ö¼Ø¼Û¼Ý¼ß¼à¼á¼ã¼ä¼è¼ê¼ë¼ì¼î¼ï¼ð¼ñ¼ò¼ó¼õ¼ö¼÷¼ø¼ù¼ú¼û¼ü½¢½£½¤½¥½¦½§½¬½¯½°½±½²½´½º½½½¾½¿½Á½Â½Ã½Ä½Å½È½É½Ê½Î½Ï½Õ½×½Ú¾¥¾ª¾­¾±¾²¾µ¾¶¾·¾º¾»¾À¾Ç¾É¾Ô¾Ù¾Ý¾â¾å¾ç¾é¾î½Ü½à½á½ë½ì½ô½õ½ö½÷½ø½ú½ý¾¡¾¢¾£¾õ¾ö¾÷¾ø¾û¾ü¿¥¿ª¿­¿Å¿Ç¿Î¿Ñ¿Ò¿Ù¿â¿ã¿ä¿é¿ë¿í¿ó¿õ¿ö¿÷¿ù¿úÀ¡À£À©À«À¯À°À³À´ÀµÀ¶À¸À¹ÀºÀ»À¼À½À¾À¿ÀÀÀÁÀÂÀÃÀÄÀÌÀÍÀÔÀÖÀØÀÝÀàÀáÀéÀëÀïÀðÀñÀöÀ÷ÀøÀùÀúÁ¤Á¥Á©ÁªÁ«Á¬Á­Á¯Á°Á±Á²Á³Á´ÁµÁ¶Á·Á¸Á¹Á½Á¾ÁÂÁÆÁÉÁÍÁÔÁÙÁÚÁÛÁÝÁÞÁäÁåÁèÁéÁëÁìÁóÁõÁúÁûÁüÁýÂ¢Â£Â¤Â¥Â¦Â§Â¨Â«Â¬Â­Â®Â¯Â°Â±Â²Â³Â¸Â»Â¼Â½Â¿ÂÀÂÁÂÂÂÅÂÆÂÇÂËÂÌÂÍÂÎÂÏÂÐÂÒÂÕÂÖÂ×ÂØÂÙÂÚÂÛÂÜÂÞÂßÂàÂáÂâÂæÂçÂèÂêÂëÂìÂíÂîÂðÂòÂóÂôÂõÂöÂ÷ÂøÂùÂúÃ¡Ã¨ÃªÃ­Ã³Ã´Ã¹Ã»Ã¾ÃÅÃÆÃÇÃÌÃÎÃÕÃÖÃÙÃàÃåÃíÃðÃõÃöÃùÃúÃýÄ±Ä¶ÄÆÄÉÄÑÄÓÄÔÄÕÄÖÄÙÄåÄìÄíÄðÄñÄôÄöÄ÷ÄøÄûÄüÄþÅ¡Å¢Å¥Å¦Å§Å¨Å©Å±ÅµÅ·Å¸Å¹Å»Å½ÅÌÅÓÅâÅçÅôÆ­Æ®ÆµÆ¶Æ»Æ¾ÆÀÆÃÆÄÆËÆÌÆÓÆ×ÆêÆëÆïÆñÆôÆøÆúÆýÇ£Ç¤Ç¥Ç¦Ç¨Ç©Ç«Ç®Ç¯Ç±Ç³Ç´ÇµÇ¹ÇºÇ½Ç¾Ç¿ÇÀÇÂÇÅÇÇÇÈÇÌÇÏÇÔÇÕÇ×ÇáÇâÇãÇêÇëÇìÇíÇîÇ÷ÇøÇûÇýÈ£È§È¨È°È´ÈµÈÃÈÄÈÅÈÆÈÈÈÍÈÏÈÒÈÙÈÞÈíÈñÈòÈóÈ÷ÈøÈúÈüÉ¡É¥É§É¨É¬É±É´É¸É¹ÉÁÉÂÉÄÉÉÉËÉÍÉÕÉÜÉÞÉãÉåÉèÉðÉóÉôÉöÉøÉùÉþÊ¤Ê¥Ê¦Ê¨ÊªÊ«Ê¬Ê±Ê´ÊµÊ¶Ê»ÊÆÊÍÊÎÊÓÊÔÊÙÊÞÊàÊäÊéÊêÊôÊõÊ÷ÊúÊýË§Ë«Ë­Ë°Ë³ËµË¶Ë¸Ë¿ËÇËÊËËËÌËÏËÐËÓËÕËßËàËäËçËêËïËðËñËõËöËøÌ¡Ì¢Ì§Ì¯Ì°Ì±Ì²Ì³Ì·Ì¸Ì¾ÌÀÌÌÌÎÌÐÌÚÌÜÌàÌâÌåÌëÌõÌùÌúÌüÌýÌþÍ­Í³Í·Í¼Í¿ÍÅÍÇÍÉÍÑÍÒÍÔÍÕÍÖÍÝÍàÍäÍåÍçÍòÍøÎ¤Î¥Î§ÎªÎ«Î¬Î­Î°Î±Î³Î½ÎÀÎÂÎÅÎÆÎÈÎÊÎÍÎÎÎÏÎÐÎÑÎØÎÙÎÚÎÜÎÞÎßÎâÎëÎíÎñÎóÎýÎþÏ®Ï°Ï³Ï·Ï¸ÏºÏ½Ï¿ÏÀÏÁÏÃÏÇÏÊÏËÏÌÏÍÏÎÏÐÏÔÏÕÏÖÏ×ÏØÏÚÏÛÏÜÏßÏáÏâÏçÏêÏìÏîÏôÏúÏþÐ¥Ð«Ð­Ð®Ð¯Ð²Ð³Ð´ÐºÐ»Ð¿ÐÆÐËÐÚÐâÐåÐéÐêÐëÐíÐ÷ÐøÐùÐüÑ¡Ñ¢Ñ¤Ñ§Ñ«Ñ¯Ñ°Ñ±ÑµÑ¶Ñ·Ñ¹Ñ»Ñ¼ÑÆÑÇÑÈÑËÑÌÑÎÑÏÑÕÑÖÑÞÑáÑâÑåÑèÑéÑìÑîÑïÑñÑôÑ÷ÑøÑùÑþÒ¡Ò¢Ò£Ò¤Ò¥Ò©Ò¯Ò³ÒµÒ¶Ò½Ò¿ÒÃÒÅÒÇÒÍÒÏÒÕÒÚÒäÒåÒèÒéÒêÒëÒìÒïÒñÒõÒøÒûÓ£Ó¤Ó¥Ó¦Ó§Ó¨Ó©ÓªÓ«Ó¬Ó±Ó´ÓµÓ¶Ó¸Ó»Ó½Ó¿ÓÅÓÇÓÊÓËÓÌÓÎÓÕÓßÓãÓæÓéÓëÓìÓïÓõÓùÓüÓþÔ¤Ô¦Ô§Ô¨Ô¯Ô°Ô±Ô²ÔµÔ¶Ô¸Ô¼Ô¾Ô¿ÔÀÔÁÔÃÔÄÔÆÔÇÔÈÔÉÔËÔÌÔÍÔÎÔÏÔÓÔÖÔØÔÜÔÝÔÞÔßÔàÔäÔæÔîÔðÔñÔòÔóÔôÔùÔúÔýÔþÕ¡Õ¢Õ©Õ«Õ®Õ±ÕµÕ¶Õ·Õ¸Õ»Õ½ÕÀÕÅÕÇÕÊÕËÕÍÕÔÕÝÕÞÕàÕâÕêÕëÕìÕïÕòÕóÕõÕöÕøÖ¡Ö£Ö¤Ö¯Ö°Ö´Ö½Ö¿ÖÀÖÄÖÊÖÓÖÕÖÖÖ×ÖÚÖßÖáÖåÖçÖèÖíÖîÖïÖòÖõÖöÖüÖýÖþ×¤×¨×©×ª×¬×®×¯×°×±×³×´×¶×¸×¹×º×»×Ç×È×Ê×Õ×Ù×Û×Ü×Ý×Þ×ç×é×êÖÂÖÓÃ´ÎªÖ»Ð××¼Æô°åÀïö¨ÓàÁ´Ð¹";
  

}