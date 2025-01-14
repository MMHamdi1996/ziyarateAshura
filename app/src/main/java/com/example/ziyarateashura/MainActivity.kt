package com.example.ziyarateashura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ziyarateashura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ziyaratAshura = mutableListOf(
            " اَلسَّلامُ عَلَیْکَ یا اَباعَبْدِاللَّهِ اَلسَّلامُ عَلَیْکَ یَابْنَ رَسُولِ اللَّهِ اَلسَّلامُ عَلَیْکَ یا خِیَرَةَ اللَّهِ و َابْنَ خِیَرَتِهِ اَلسَّلامُ عَلَیْکَ یَابْنَ اَمیرِالْمُؤْمِنینَ و َابْنَ سَیِّدِ الْوَصِیّینَ"
        )


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(this, ziyaratAshura)


        ziyaratAshura.add("اَلسَّلامُ عَلَیْکَ یَابْنَ فاطِمَةَ سَیِّدَةِ نِساَّءِ الْعالَمینَ اَلسَّلامُ عَلَیْکَ یا ثارَ اللَّهِ وَ ابْنَ ثارِهِ وَ الْوِتْرَ الْمَوْتُورَ")
        ziyaratAshura.add("اَلسَّلامُ عَلَیْکَ وَعَلَی الاَْرْواحِ الَّتی حَلَّتْ بِفِناَّئِکَ عَلَیْکُمْ مِنّی جَمیعاً سَلامُ اللَّهِ اَبَداً ما بَقیتُ وَ بَقِیَ اللَّیْلُ وَالنَّهارُ")
        ziyaratAshura.add("یا اَباعَبْدِاللَّهِ لَقَدْ عَظُمَتِ الرَّزِیَّةُ وَ جَلَّتْ وَ عَظُمَتِ الْمُصیبَةُ بِکَ (بِکُمْ) عَلَیْنا وَ عَلی جَمیعِ اَهْل ِالاِْسْلامِ")
        ziyaratAshura.add("و َجَلَّتْ وَ عَظُمَتْ مُصیبَتُکَ فِی السَّمواتِ عَلی جَمیعِ اَهْلِ السَّمواتِ فَلَعَنَ اللَّهُ اُمَّةً اَسَّسَتْ اَساسَ الظُّلْمِ وَ الْجَوْرِ عَلَیْکُمْ اَهْلَ الْبَیْتِ")
        ziyaratAshura.add("وَ لَعَن َاللَّهُ اُمَّةً دَفَعَتْکُمْ عَنْ مَقامِکُمْ و َاَزالَتْکُمْ عَنْ مَراتِبِکُمُ الَّتی رَتَّبَکُمُ اللَّهُ فیها ")
        ziyaratAshura.add("و َلَعَنَ اللَّهُ اُمَّةً قَتَلَتْکُمْ وَ لَعَنَ اللَّهُ الْمُمَهِّدینَ لَهُمْ بِالتَّمْکینِ مِنْ قِتالِکُمْ")
        ziyaratAshura.add("بَرِئْتُ اِلَی اللَّهِ وَ اِلَیْکُمْ مِنْهُمْ وَ مِنْ اَشْیاعِهِمْ وَ اَتْباعِهِمْ وَ اَوْلِیاَّئِهِم")
        ziyaratAshura.add("یا اَباعَبْدِاللَّهِ اِنّی سِلْمٌ لِمَنْ سالَمَکُمْ وَ حَرْبٌ لِمَنْ حارَبَکُمْ اِلی یَوْمِ الْقِیامَةِ ")
        ziyaratAshura.add("وَ لَعَنَ اللَّهُ آلَ زِیادٍ وَ آلَ مَرْوانَ وَ لَعَنَ اللَّهُ بَنی اُمَیَّةَ قاطِبَةً وَ لَعَنَ اللَّهُ ابْنَ مَرْجانَةَ")
        ziyaratAshura.add("وَ لَعَنَ اللَّهُ عُمَرَ بْنَ سَعْدٍ وَ لَعَنَ اللَّهُ شِمْراً (شَمِراً)وَ لَعَنَ اللَّهُ اُمَّةً اَسْرَجَتْ وَ اَلْجَمَتْ وَ تَنَقَّبَتْ لِقِتالِکَ")
        ziyaratAshura.add("بِاَبی اَنْتَ وَ اُمّی لَقَدْ عَظُمَ مُصابی بِکَ فَاَسْئَلُ اللَّهَ الَّذی اَکْرَمَ مَقامَکَ وَ اَکْرَمَنی بِکَ")
        ziyaratAshura.add("اَنْ یَرْزُقَنی طَلَبَ ثارِکَ مَعَ اِمامٍ مَنْصُورٍ مِنْ اَهْلِ بَیْتِ مُحَمَّدٍ صَلَّی اللَّهُ عَلَیْهِ و َآلِهِ")
        ziyaratAshura.add("اَللّهُمَّ اجْعَلْنی عِنْدَکَ وَجیهاً بِالْحُسَیْنِ عَلَیْهِ السَّلامُ فِی الدُّنْیا وَ الاْخِرَةِ")
        ziyaratAshura.add("یا اَباعَبْدِاللَّهِ اِنّی اَتَقَرَّبُ اِلی اللَّهِ وَ اِلی رَسُولِهِ وَ اِلی امیرِالْمُؤْمِنینَ وَ اِلی فاطِمَةَ وَ اِلَی الْحَسَنِ وَ اِلَیْکَ بِمُوالاتِکَ")
        ziyaratAshura.add("وَ بِالْبَراَّئَةِ (مِمَّنْ قاتَلَکَ وَ نَصَبَ لَکَ الْحَرْبَ وَ بِالْبَرائَةِ مِمَّنْ اَسَّسَ اَساسَ الظُّلْمِ وَ الْجَوْرِعَلَیْکُمْ وَ اَبْرَءُ اِلَی اللّهِ وَ اِلی رَسُولِهِ) مِمَّنْ اَسَسَّ اَساسَ ذلِکَ وَ بَنی عَلَیْهِ بُنْیانَهُ وَ جَری فی ظُلْمِهِ وَ جَوْرِهِ عَلَیْکُمْ وَ علی اَشْیاعِکُمْ  بَرِئْتُ اِلَی اللَّهِ وَ اِلَیْکُمْ مِنْهُمْ")
        ziyaratAshura.add("وَ اَتَقَرَّبُ اِلَی اللَّهِ ثُمَّ اِلَیْکُمْ بِمُوالاتِکُمْ وَ مُوالاةِ وَلِیِّکُمْ ")
        ziyaratAshura.add("وَ بِالْبَرآئَةِ مِنْ اَعْداَّئِکُمْ وَ النّاصِبینَ لَکُمُ الْحَرْبَ وَ بِالْبَرآئَةِ مِنْ اَشْیاعِهِمْ وَ اَتْباعِهِمْ ")
        ziyaratAshura.add("اِنّی سِلْمٌ لِمَنْ سالَمَکُمْ وَحَرْبٌ لِمَنْ حارَبَکُمْ وَ وَلِیُّ لِمَنْ والاکُمْ وَ عَدُوُّ لِمَنْ عاداکُمْ ")
        ziyaratAshura.add("فَاَسْئَلُ اللَّهَ الَّذی اَکْرَمَنی بِمَعْرِفَتِکُمْ وَمَعْرِفَةِ اَوْلِیاَّئِکُمْ وَ رَزَقَنِی الْبَراَّئَةَ مِنْ اَعْداَّئِکُمْ")
        ziyaratAshura.add("اَنْ یَجْعَلَنی مَعَکُمْ فِی الدُّنْیا وَالاْخِرَةِ وَاَنْ یُثَبِّتَ لی عِنْدَکُمْ قَدَمَ صِدْقٍ فِی الدُّنْیا وَ الاْخِرَةِ")
        ziyaratAshura.add("وَ اَسْئَلُهُ اَنْ یُبَلِّغَنِی الْمَقامَ الْمَحْمُودَ لَکُمْ عِنْدَ اللَّهِ وَ اَنْ یَرْزُقَنی طَلَبَ ثاری مَعَ اِمامٍ هُدیً ظاهِرٍ ناطِقٍ (بِالْحَقِّ) مِنْکُمْ")
        ziyaratAshura.add("وَ اَسْئَلُ اللَّهَ بِحَقِّکُمْ وَبِالشَّاْنِ الَّذی لَکُمْ عِنْدَهُ اَنْ یُعْطِیَنی بِمُصابی بِکُمْ اَفْضَلَ ما یُعْطی مُصاباً بِمُصیبَتِهِ مُصیبَةً ما اَعْظَمَها")
        ziyaratAshura.add("وَ اَعْظَمَ رَزِیَّتَها فِی الاِْسْلامِ وَ فی جَمیعِ السَّمواتِ وَ الاَْرْضِ (الْأَرَضِینَ)اَللّهُمَّ اجْعَلْنی فی مَقامی هذا مِمَّنْ تَنالُهُ مِنْکَ صَلَواتٌ وَ رَحْمَةٌ وَ مَغْفِرَةٌ")
        ziyaratAshura.add("اَللّهُمَّ اجْعَلْ مَحْیایَ مَحْیا مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ مَماتی مَماتَ مُحَمَّدٍ وَ آلِ مُحَمَّدٍ")
        ziyaratAshura.add("اَللّهُمَّ اِنَّ هذا یَوْمٌ تَبرَّکَتْ بِهِ (فِیهِ)بَنُو اُمَیَّةَ وَ ابْنُ آکِلَةِ الَْآکبادِ اللَّعینُ ابْنُ اللَّعینِ عَلی لِسانِکَ وَ لِسانِ نَبِیِّکَ صَلَّی اللَّهُ عَلَیْهِ وَ آلِهِ")
        ziyaratAshura.add("فی کُلِّ مَوْطِنٍ وَ مَوْقِفٍ وَقَفَ فیهِ نَبِیُّکَ صَلَّی اللَّهُ عَلَیْهِ وَ آلِهِ ")
        ziyaratAshura.add("اَللّهُمَّ الْعَنْ اَباسُفْیانَ وَ مُعاوِیَةَ وَ یَزیدَ بْنَ مُعاوِیَةَ عَلَیْهِمْ مِنْکَ اللَّعْنَةُ اَبَدَ الاْبِدینَ ")
        ziyaratAshura.add("وَ هذا یَوْمٌ فَرِحَتْ بِهِ آلُ زِیادٍ وَ آلُ مَرْوانَ بِقَتْلِهِمُ الْحُسَیْنَ صَلَواتُ اللَّهِ عَلَیْهِ (عَلَیْهِ السَّلاَمُ)")
        ziyaratAshura.add("اَللّهُمَّ فَضاعِفْ عَلَیْهِمُ اللَّعْنَ مِنْکَ وَ الْعَذابَ (الاَْلیمَ) اَللّهُمَّ اِنّی اَتَقَرَّبُ اِلَیْکَ فی هذَا الْیَوْمِ وَ فی مَوْقِفی هذا")
        ziyaratAshura.add("پس صد مرتبه می‌گویی :")
        ziyaratAshura.add("وَ اَیّامِ حَیاتی بِالْبَراَّئَهِ مِنْهُمْ وَاللَّعْنَةِ عَلَیْهِمْ وَ بِالْمُوالاتِ لِنَبِیِّکَ وَ آلِ نَبِیِّکَ عَلَیْهِ وَ عَلَیْهِمُ اَلسَّلامُ")
        ziyaratAshura.add("اَللّهُمَّ الْعَنْ اَوَّلَ ظالِمٍ ظَلَمَ حَقَّ مُحَمَّدٍ وَ آلِ مُحَمَّدٍ وَ آخِرَ تابِعٍ لَهُ عَلی ذلِکَ")
        ziyaratAshura.add("اَللّهُمَّ الْعَنِ الْعِصابَةَ الَّتی (الَّذِینَ)جاهَدَتِ الْحُسَیْنَ وَ شایَعَتْ وَ بایَعَتْ وَ تابَعَتْ (تَایَعَتْ)عَلی قَتْلِهِ اَللّهُمَّ الْعَنْهُمْ جَمیعاً")
        ziyaratAshura.add("پس صد مرتبه می‌گویی :")
        ziyaratAshura.add("اَلسَّلامُ عَلَیْکَ یا اَباعَبْدِاللَّهِ وَ عَلَی الاَْرْواحِ الَّتی حَلَّتْ بِفِناَّئِکَ عَلَیْکَ مِنّی سَلامُ اللَّهِ (اَبَداً) ما بَقیتُ وَ بَقِیَ اللَّیْلُ وَ النَّهارُ وَ لاجَعَلَهُ اللَّهُ آخِرَ الْعَهْدِ مِنّی لِزِیارَتِکُمْ")
        ziyaratAshura.add("اَلسَّلامُ عَلَی الْحُسَیْنِ وَ عَلی عَلِیِّ بْنِ الْحُسَیْنِ وَ عَلی اَوْلادِ الْحُسَیْنِ وَ عَلی اَصْحابِ الْحُسَیْنِ")
        ziyaratAshura.add("پس می گویی : ")
        ziyaratAshura.add("اَللّهُمَّ خُصَّ اَنْتَ اَوَّلَ ظالِمٍ بِاللَّعْنِ مِنّی وَ ابْدَاءْ بِهِ اَوَّلاً ثُمَّ (الْعَنِ) الثَّانِیَ وَالثّالِثَ وَ الرّابِعَ")
        ziyaratAshura.add("اَللّهُمَّ الْعَنْ یَزیدَ خامِساً وَ الْعَنْ عُبَیْدَ اللَّهِ بْنَ زِیادٍ وَ ابْنَ مَرْجانَةَ وَ عُمَرَ بْنَ سَعْدٍ وَ شِمْراً وَ آلَ اَبی سُفْیانَ وَ آلَ زِیادٍ وَ آلَ مَرْوانَ اِلی یَوْمِ الْقِیمَةِ")
        ziyaratAshura.add("پس به سجده می روی و می گویی : ")
        ziyaratAshura.add("اَللّهُمَّ لَکَ الْحَمْدُ حَمْدَ الشّاکِرینَ لَکَ عَلی مُصابِهِمْ اَلْحَمْدُ لِلَّهِ عَلی عَظیمِ رَزِیَّتی اَللّهُمَّ ارْزُقْنی شَفاعَةَ الْحُسَیْنِ یَوْمَ الْوُرُودِ وَ ثَبِّتْ لی قَدَمَ صِدْقٍ عِنْدَکَ مَعَ الْحُسَیْنِ وَ اَصْحابِ الْحُسَیْنِ الَّذینَ بَذَلُوا مُهَجَهُمْ دُونَ الْحُسَیْنِ عَلَیْهِ السَّلامُ ")

    }
}