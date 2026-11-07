package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zl0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f11335a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f11336b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11337c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f11338d;

    static {
        HashMap map = new HashMap();
        f11338d = map;
        androidx.camera.camera2.internal.compat.workaround.c.e(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        androidx.camera.camera2.internal.compat.workaround.c.e(-983041, map, "azure", -657956, "beige");
        androidx.camera.camera2.internal.compat.workaround.c.e(-6972, map, "bisque", -16777216, "black");
        androidx.camera.camera2.internal.compat.workaround.c.e(-5171, map, "blanchedalmond", -16776961, "blue");
        androidx.camera.camera2.internal.compat.workaround.c.e(-7722014, map, "blueviolet", -5952982, "brown");
        androidx.camera.camera2.internal.compat.workaround.c.e(-2180985, map, "burlywood", -10510688, "cadetblue");
        androidx.camera.camera2.internal.compat.workaround.c.e(-8388864, map, "chartreuse", -2987746, "chocolate");
        androidx.camera.camera2.internal.compat.workaround.c.e(-32944, map, "coral", -10185235, "cornflowerblue");
        androidx.camera.camera2.internal.compat.workaround.c.e(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        androidx.camera.camera2.internal.compat.workaround.c.e(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        androidx.camera.camera2.internal.compat.workaround.c.e(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        androidx.camera.camera2.internal.compat.workaround.c.e(-29696, map, "darkorange", -6737204, "darkorchid");
        androidx.camera.camera2.internal.compat.workaround.c.e(-7667712, map, "darkred", -1468806, "darksalmon");
        androidx.camera.camera2.internal.compat.workaround.c.e(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        androidx.camera.camera2.internal.compat.workaround.c.e(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        androidx.camera.camera2.internal.compat.workaround.c.e(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        androidx.camera.camera2.internal.compat.workaround.c.e(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        androidx.camera.camera2.internal.compat.workaround.c.e(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        androidx.camera.camera2.internal.compat.workaround.c.e(-38476, map, "hotpink", -3318692, "indianred");
        androidx.camera.camera2.internal.compat.workaround.c.e(-11861886, map, "indigo", -16, "ivory");
        androidx.camera.camera2.internal.compat.workaround.c.e(-989556, map, "khaki", -1644806, "lavender");
        androidx.camera.camera2.internal.compat.workaround.c.e(-3851, map, "lavenderblush", -8586240, "lawngreen");
        androidx.camera.camera2.internal.compat.workaround.c.e(-1331, map, "lemonchiffon", -5383962, "lightblue");
        androidx.camera.camera2.internal.compat.workaround.c.e(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        androidx.camera.camera2.internal.compat.workaround.c.e(-18751, map, "lightpink", -24454, "lightsalmon");
        androidx.camera.camera2.internal.compat.workaround.c.e(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        androidx.camera.camera2.internal.compat.workaround.c.e(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        androidx.camera.camera2.internal.compat.workaround.c.e(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        androidx.camera.camera2.internal.compat.workaround.c.e(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        androidx.camera.camera2.internal.compat.workaround.c.e(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        androidx.camera.camera2.internal.compat.workaround.c.e(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        androidx.camera.camera2.internal.compat.workaround.c.e(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        androidx.camera.camera2.internal.compat.workaround.c.e(-15132304, map, "midnightblue", -655366, "mintcream");
        androidx.camera.camera2.internal.compat.workaround.c.e(-6943, map, "mistyrose", -6987, "moccasin");
        androidx.camera.camera2.internal.compat.workaround.c.e(-8531, map, "navajowhite", -16777088, "navy");
        androidx.camera.camera2.internal.compat.workaround.c.e(-133658, map, "oldlace", -8355840, "olive");
        androidx.camera.camera2.internal.compat.workaround.c.e(-9728477, map, "olivedrab", -23296, "orange");
        androidx.camera.camera2.internal.compat.workaround.c.e(-47872, map, "orangered", -2461482, "orchid");
        androidx.camera.camera2.internal.compat.workaround.c.e(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        androidx.camera.camera2.internal.compat.workaround.c.e(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        androidx.camera.camera2.internal.compat.workaround.c.e(-4139, map, "papayawhip", -9543, "peachpuff");
        androidx.camera.camera2.internal.compat.workaround.c.e(-3308225, map, "peru", -16181, "pink");
        androidx.camera.camera2.internal.compat.workaround.c.e(-2252579, map, "plum", -5185306, "powderblue");
        androidx.camera.camera2.internal.compat.workaround.c.e(-8388480, map, "purple", -10079335, "rebeccapurple");
        androidx.camera.camera2.internal.compat.workaround.c.e(-65536, map, "red", -4419697, "rosybrown");
        androidx.camera.camera2.internal.compat.workaround.c.e(-12490271, map, "royalblue", -7650029, "saddlebrown");
        androidx.camera.camera2.internal.compat.workaround.c.e(-360334, map, "salmon", -744352, "sandybrown");
        androidx.camera.camera2.internal.compat.workaround.c.e(-13726889, map, "seagreen", -2578, "seashell");
        androidx.camera.camera2.internal.compat.workaround.c.e(-6270419, map, "sienna", -4144960, "silver");
        androidx.camera.camera2.internal.compat.workaround.c.e(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        androidx.camera.camera2.internal.compat.workaround.c.e(-12156236, map, "steelblue", -2968436, "tan");
        androidx.camera.camera2.internal.compat.workaround.c.e(-16744320, map, "teal", -2572328, "thistle");
        androidx.camera.camera2.internal.compat.workaround.c.e(-40121, map, "tomato", 0, "transparent");
        androidx.camera.camera2.internal.compat.workaround.c.e(-12525360, map, "turquoise", -1146130, "violet");
        androidx.camera.camera2.internal.compat.workaround.c.e(-663885, map, "wheat", -1, "white");
        androidx.camera.camera2.internal.compat.workaround.c.e(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z6) throws NumberFormatException {
        int i6;
        y5.n(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
        if (strReplace.charAt(0) == '#') {
            int i7 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i7;
            }
            if (strReplace.length() == 9) {
                return ((i7 & 255) << 24) | (i7 >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z6 ? f11337c : f11336b).matcher(strReplace);
            if (matcher.matches()) {
                if (z6) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i6 = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i6 = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i8 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i9 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i6, i8, i9, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = f11335a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i10 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i11 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i10, i11, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) f11338d.get(rj1.g(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
