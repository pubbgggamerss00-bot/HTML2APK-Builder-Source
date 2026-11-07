package l9;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.HtmlToApkApplication;
import com.basitce.htmltoapk.R;
import f9.sa;
import i0.x1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f16789a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final List<String> f16790b = qg.p.j("tr", "en", "es", "hi", "pt", "ru", "ja", "ko", "de", "fr", "it", "zh", "ar", "id", "vi", "pl", "nl", "th", "uk", "ms", "fa", "bn", "ur", "te", "mr", "ta", "gu", "kn", "ml", "pa", "sv", "da", "no", "fi", "el", "cs", "hu", "ro", "bg", "sr", "hr", "sk", "sl", "he", "fil", "ca");

    /* renamed from: c, reason: collision with root package name */
    public static volatile List<b> f16791c;

    public static b a(String str) {
        String strValueOf;
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        String displayName = localeForLanguageTag.getDisplayName(localeForLanguageTag);
        kotlin.jvm.internal.r.d(displayName, "getDisplayName(...)");
        if (displayName.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char cCharAt = displayName.charAt(0);
            sb.append((Object) (Character.isLowerCase(cCharAt) ? g8.w.k(cCharAt, localeForLanguageTag) : String.valueOf(cCharAt)));
            String strSubstring = displayName.substring(1);
            kotlin.jvm.internal.r.d(strSubstring, "substring(...)");
            sb.append(strSubstring);
            displayName = sb.toString();
        }
        Locale ENGLISH = Locale.ENGLISH;
        String displayLanguage = localeForLanguageTag.getDisplayLanguage(ENGLISH);
        kotlin.jvm.internal.r.d(displayLanguage, "getDisplayLanguage(...)");
        if (displayLanguage.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt2 = displayLanguage.charAt(0);
            if (Character.isLowerCase(cCharAt2)) {
                kotlin.jvm.internal.r.d(ENGLISH, "ENGLISH");
                strValueOf = g8.w.k(cCharAt2, ENGLISH);
            } else {
                strValueOf = String.valueOf(cCharAt2);
            }
            sb2.append((Object) strValueOf);
            String strSubstring2 = displayLanguage.substring(1);
            kotlin.jvm.internal.r.d(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            displayLanguage = sb2.toString();
        }
        return new b(str, displayName, displayLanguage);
    }

    public static String b(String str) {
        if (mh.x.A(str)) {
            return "";
        }
        String language = Locale.forLanguageTag(mh.t.p(str, "b+", false) ? mh.t.m(mh.x.I(str, "b+"), '+', '-') : mh.t.m(str, '_', '-')).getLanguage();
        kotlin.jvm.internal.r.d(language, "getLanguage(...)");
        String lowerCase = language.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static List c(Context context) throws Resources.NotFoundException {
        int length;
        kotlin.jvm.internal.r.e(context, "context");
        List<b> list = f16791c;
        if (list != null) {
            return list;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("tr");
        linkedHashSet.add("en");
        try {
            kotlin.jvm.internal.b bVarE = f3.f.e(context.getAssets().getLocales());
            while (bVarE.hasNext()) {
                String str = (String) bVarE.next();
                kotlin.jvm.internal.r.b(str);
                String strB = b(str);
                if (strB.length() > 0 && 2 <= (length = strB.length()) && length < 9) {
                    linkedHashSet.add(strB);
                }
            }
        } catch (Exception unused) {
        }
        linkedHashSet.addAll(f16790b);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a("tr"));
        arrayList.add(a("en"));
        Iterator it = linkedHashSet.iterator();
        kotlin.jvm.internal.r.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.r.d(next, "next(...)");
            String str2 = (String) next;
            if (!str2.equals("tr") && !str2.equals("en")) {
                try {
                    Locale localeForLanguageTag = Locale.forLanguageTag(str2);
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.setLocale(localeForLanguageTag);
                    Resources resources = context.createConfigurationContext(configuration).getResources();
                    String string = resources.getString(R.string.nav_settings);
                    kotlin.jvm.internal.r.d(string, "getString(...)");
                    String string2 = resources.getString(R.string.nav_projects);
                    kotlin.jvm.internal.r.d(string2, "getString(...)");
                    String string3 = resources.getString(R.string.settings_language);
                    kotlin.jvm.internal.r.d(string3, "getString(...)");
                    String string4 = resources.getString(R.string.common_cancel);
                    kotlin.jvm.internal.r.d(string4, "getString(...)");
                    if (!string.equals("Settings") || !string2.equals("Projects") || !string3.equals("Language") || !string4.equals("Cancel")) {
                        arrayList.add(a(str2));
                    }
                } catch (Exception unused2) {
                }
            }
        }
        Iterator it2 = qg.p.j("pt", "id", "th", "ms", "en-SG").iterator();
        while (true) {
            int i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            String str3 = (String) it2.next();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (mh.t.j(((b) obj).f16781a, str3, true)) {
                        break;
                    }
                }
            }
            arrayList.add(a(str3));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            if (hashSet.add(((b) obj2).f16781a)) {
                arrayList2.add(obj2);
            }
        }
        List<b> listU = qg.x.U(x1.a(new c0(), new sa(1)), arrayList2);
        f16791c = listU;
        return listU;
    }

    public static String d(Context context, String languageCode) throws Resources.NotFoundException {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(languageCode, "languageCode");
        Object obj = null;
        if (!languageCode.equals("system")) {
            Iterator it = c(context).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.r.a(((b) next).f16781a, languageCode)) {
                    obj = next;
                    break;
                }
            }
            b bVarA = (b) obj;
            if (bVarA == null) {
                bVarA = a(languageCode);
            }
            return bVarA.a();
        }
        String strE = e(context);
        Iterator it2 = c(context).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (kotlin.jvm.internal.r.a(((b) next2).f16781a, strE)) {
                obj = next2;
                break;
            }
        }
        b bVarA2 = (b) obj;
        if (bVarA2 == null) {
            bVarA2 = a(strE);
        }
        String string = context.getString(R.string.settings_language_system);
        kotlin.jvm.internal.r.d(string, "getString(...)");
        return string + " (" + bVarA2.f16782b + ")";
    }

    public static String e(Context context) throws Resources.NotFoundException {
        kotlin.jvm.internal.r.e(context, "context");
        Locale localeF = f(context);
        List listC = c(context);
        ArrayList arrayList = new ArrayList(qg.p.h(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).f16781a);
        }
        String languageTag = localeF.toLanguageTag();
        kotlin.jvm.internal.r.d(languageTag, "toLanguageTag(...)");
        Locale locale = Locale.ROOT;
        String lowerCase = languageTag.toLowerCase(locale);
        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
        String language = localeF.getLanguage();
        kotlin.jvm.internal.r.d(language, "getLanguage(...)");
        String lowerCase2 = language.toLowerCase(locale);
        kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
        return arrayList.contains(lowerCase) ? lowerCase : arrayList.contains(lowerCase2) ? lowerCase2 : "en";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Locale f(Context context) {
        Configuration configuration;
        LocaleList locales;
        if (context != null) {
            try {
                Resources resources = context.getResources();
                locales = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : configuration.getLocales();
            } catch (Exception unused) {
                return Locale.getDefault();
            }
        }
        return (locales == null || locales.isEmpty()) ? Locale.getDefault() : locales.get(0);
    }

    public static Context g(Hilt_HtmlToApkApplication context) {
        kotlin.jvm.internal.r.e(context, "context");
        HtmlToApkApplication.Companion.getClass();
        Context context2 = HtmlToApkApplication.localizedContext;
        if (context2 != null) {
            return context2;
        }
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(Locale.forLanguageTag("en"));
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.r.d(contextCreateConfigurationContext, "run(...)");
        return contextCreateConfigurationContext;
    }

    public static String h(Context context, String str) {
        kotlin.jvm.internal.r.e(context, "context");
        List listC = c(context);
        ArrayList arrayList = new ArrayList(qg.p.h(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((b) it.next()).f16781a);
        }
        return (str == null || str.equals("system")) ? e(context) : arrayList.contains(str) ? str : "en";
    }

    public static Context i(Context context, String languageCode) {
        kotlin.jvm.internal.r.e(languageCode, "languageCode");
        Locale localeForLanguageTag = Locale.forLanguageTag(h(context, languageCode));
        Locale.setDefault(localeForLanguageTag);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(localeForLanguageTag);
        configuration.setLocales(new LocaleList(localeForLanguageTag));
        context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.r.d(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
    
        if (r1.contains(r14) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(Context context, String selectedLanguage) {
        String string;
        Configuration configuration;
        LocaleList locales;
        kotlin.jvm.internal.r.e(selectedLanguage, "selectedLanguage");
        Set setC = qg.o.C(new String[]{"pt", "id", "in", "th", "ms"});
        Set setC2 = qg.o.C(new String[]{"BR", "ID", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.A, "SG"});
        String string2 = mh.x.W(selectedLanguage).toString();
        if (string2.length() <= 0 || string2.equalsIgnoreCase("system")) {
            try {
                HtmlToApkApplication.Companion.getClass();
                string = mh.x.W(HtmlToApkApplication.currentLanguage).toString();
            } catch (Exception unused) {
                string = "";
            }
            if (string.length() <= 0 || string.equalsIgnoreCase("system")) {
                Locale locale = null;
                if (context != null) {
                    try {
                        Resources resources = context.getResources();
                        if (resources != null && (configuration = resources.getConfiguration()) != null && (locales = configuration.getLocales()) != null && !locales.isEmpty()) {
                            locale = locales.get(0);
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (locale != null) {
                    String language = locale.getLanguage();
                    kotlin.jvm.internal.r.d(language, "getLanguage(...)");
                    Locale locale2 = Locale.ROOT;
                    String lowerCase = language.toLowerCase(locale2);
                    kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                    String country = locale.getCountry();
                    kotlin.jvm.internal.r.d(country, "getCountry(...)");
                    String upperCase = country.toUpperCase(locale2);
                    kotlin.jvm.internal.r.d(upperCase, "toUpperCase(...)");
                    if (!setC.contains(lowerCase)) {
                    }
                }
                Locale localeF = f(context);
                String language2 = localeF.getLanguage();
                kotlin.jvm.internal.r.d(language2, "getLanguage(...)");
                Locale locale3 = Locale.ROOT;
                String lowerCase2 = language2.toLowerCase(locale3);
                kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
                String country2 = localeF.getCountry();
                kotlin.jvm.internal.r.d(country2, "getCountry(...)");
                String upperCase2 = country2.toUpperCase(locale3);
                kotlin.jvm.internal.r.d(upperCase2, "toUpperCase(...)");
                return setC.contains(lowerCase2) || setC2.contains(upperCase2);
            }
            String strM = mh.t.p(string, "b+", false) ? mh.t.m(mh.x.I(string, "b+"), '+', '-') : mh.t.m(string, '_', '-');
            String strU = mh.x.U(strM, '-');
            Locale locale4 = Locale.ROOT;
            String lowerCase3 = strU.toLowerCase(locale4);
            kotlin.jvm.internal.r.d(lowerCase3, "toLowerCase(...)");
            if (!setC.contains(lowerCase3)) {
                if (mh.x.s(strM, '-')) {
                    String upperCase3 = mh.x.T(strM, '-', strM).toUpperCase(locale4);
                    kotlin.jvm.internal.r.d(upperCase3, "toUpperCase(...)");
                    if (!setC2.contains(upperCase3)) {
                    }
                }
            }
        } else {
            String strM2 = mh.t.p(string2, "b+", false) ? mh.t.m(mh.x.I(string2, "b+"), '+', '-') : mh.t.m(string2, '_', '-');
            String strU2 = mh.x.U(strM2, '-');
            Locale locale5 = Locale.ROOT;
            String lowerCase4 = strU2.toLowerCase(locale5);
            kotlin.jvm.internal.r.d(lowerCase4, "toLowerCase(...)");
            if (!setC.contains(lowerCase4)) {
                if (mh.x.s(strM2, '-')) {
                    String upperCase4 = mh.x.T(strM2, '-', strM2).toUpperCase(locale5);
                    kotlin.jvm.internal.r.d(upperCase4, "toUpperCase(...)");
                    if (!setC2.contains(upperCase4)) {
                    }
                }
            }
        }
        return true;
    }
}
