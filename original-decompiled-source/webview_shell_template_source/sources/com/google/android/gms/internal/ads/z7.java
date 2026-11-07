package com.google.android.gms.internal.ads;

import android.text.Layout;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z7 implements a7 {
    public final XmlPullParserFactory s;

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f11194t = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f11195u = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f11196v = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f11197w = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f11198x = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f11199y = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f11200z = Pattern.compile("^(\\d+) (\\d+)$");
    public static final x7 A = new x7(30.0f, 1, 1);

    public z7() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.s = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    public static long c(String str, x7 x7Var) throws NumberFormatException, y6 {
        double d7;
        double d8;
        Matcher matcher = f11194t.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j6 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j7 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d9 = j6 + j7;
            double d10 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d11 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d12 = d9 + d10;
            return (long) ((d12 + d11 + (matcher.group(5) != null ? Long.parseLong(r12) / x7Var.f10396a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / x7Var.f10397b) / x7Var.f10396a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f11195u.matcher(str);
        if (!matcher2.matches()) {
            throw new y6("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d13 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals("s");
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d7 = x7Var.f10398c;
                            d13 /= d7;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d7 = 1000.0d;
                        d13 /= d7;
                    }
                } else if (strGroup6.equals("m")) {
                    d8 = 60.0d;
                    d13 *= d8;
                }
            } else if (strGroup6.equals("h")) {
                d8 = 3600.0d;
                d13 *= d8;
            }
        } else if (strGroup6.equals("f")) {
            d7 = x7Var.f10396a;
            d13 /= d7;
        }
        return (long) (d13 * 1000000.0d);
    }

    public static Layout.Alignment d(String str) {
        String strG = rj1.g(str);
        switch (strG.hashCode()) {
            case -1364013995:
                if (strG.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strG.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strG.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strG.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strG.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static b8 e(b8 b8Var) {
        return b8Var == null ? new b8() : b8Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211 A[Catch: y6 -> 0x026a, TryCatch #0 {y6 -> 0x026a, blocks: (B:91:0x01a8, B:94:0x01b9, B:97:0x01cb, B:101:0x01d4, B:103:0x01da, B:112:0x01f2, B:122:0x020b, B:124:0x0211, B:125:0x0218, B:126:0x0219, B:127:0x0232, B:116:0x01fd, B:121:0x0209, B:128:0x0233, B:129:0x0234, B:130:0x024d, B:96:0x01c0, B:131:0x024e, B:132:0x0269), top: B:224:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b8 f(XmlPullParser xmlPullParser, b8 b8Var) throws y6 {
        Matcher matcher;
        String strGroup;
        v7 v7Var;
        int i6;
        np1 np1VarL;
        int i7;
        int attributeCount = xmlPullParser.getAttributeCount();
        boolean z6 = false;
        b8 b8VarE = b8Var;
        for (int i8 = 0; i8 < attributeCount; i8++) {
            String attributeValue = xmlPullParser.getAttributeValue(i8);
            String attributeName = xmlPullParser.getAttributeName(i8);
            int i9 = -1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        b8VarE = e(b8VarE);
                        b8VarE.f2969i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                        continue;
                    }
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        b8VarE = e(b8VarE);
                        b8VarE.f2962a = attributeValue;
                    } else {
                        continue;
                    }
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        b8VarE = e(b8VarE);
                        b8VarE.f2975o = d(attributeValue);
                    } else {
                        continue;
                    }
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        String strG = rj1.g(attributeValue);
                        switch (strG.hashCode()) {
                            case -1461280213:
                                if (strG.equals("nounderline")) {
                                    b8VarE = e(b8VarE);
                                    z6 = false;
                                    b8VarE.f2968g = 0;
                                    break;
                                }
                                break;
                            case -1026963764:
                                if (strG.equals("underline")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2968g = 1;
                                    break;
                                }
                                break;
                            case 913457136:
                                if (strG.equals("nolinethrough")) {
                                    b8VarE = e(b8VarE);
                                    z6 = false;
                                    b8VarE.f2967f = 0;
                                    break;
                                }
                                break;
                            case 1679736913:
                                if (strG.equals("linethrough")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2967f = 1;
                                    break;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        b8VarE = e(b8VarE);
                        b8VarE.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                        break;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        b8VarE = e(b8VarE);
                        b8VarE.f2972l = attributeValue;
                        break;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        String strG2 = rj1.g(attributeValue);
                        switch (strG2.hashCode()) {
                            case -618561360:
                                if (strG2.equals("baseContainer")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2973m = 2;
                                    break;
                                }
                                break;
                            case -410956671:
                                if (strG2.equals("container")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2973m = 1;
                                    break;
                                }
                                break;
                            case -250518009:
                                if (strG2.equals("delimiter")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2973m = 4;
                                    break;
                                }
                                break;
                            case -136074796:
                                if (strG2.equals("textContainer")) {
                                    b8VarE = e(b8VarE);
                                    b8VarE.f2973m = 3;
                                    break;
                                }
                                break;
                            case 3016401:
                                if (strG2.equals("base")) {
                                }
                                break;
                            case 3556653:
                                if (strG2.equals("text")) {
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        b8VarE = e(b8VarE);
                        try {
                            b8VarE.f2963b = zl0.a(attributeValue, false);
                            b8VarE.f2964c = true;
                            break;
                        } catch (IllegalArgumentException unused) {
                            androidx.camera.core.t.d(attributeValue, "Failed parsing color value: ", "TtmlParser");
                            break;
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        b8 b8VarE2 = e(b8VarE);
                        Matcher matcher2 = f11197w.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup2 = matcher2.group(1);
                                if (strGroup2 == null) {
                                    throw null;
                                    break;
                                } else {
                                    fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup2)));
                                }
                            } catch (NumberFormatException e6) {
                                qs0.g("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e6);
                            }
                        } else {
                            androidx.camera.core.t.d(attributeValue, "Invalid value for shear: ", "TtmlParser");
                        }
                        b8VarE2.s = fMin;
                        b8VarE = b8VarE2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strG3 = rj1.g(attributeValue);
                        int iHashCode = strG3.hashCode();
                        if (iHashCode == 96673) {
                            if (strG3.equals("all")) {
                                b8VarE = e(b8VarE);
                                b8VarE.f2977q = 1;
                                break;
                            }
                        } else if (iHashCode == 3387192 && strG3.equals("none")) {
                            b8VarE = e(b8VarE);
                            z6 = false;
                            b8VarE.f2977q = 0;
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            b8VarE = e(b8VarE);
                            int i10 = j31.f5914a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            Pattern pattern = f11196v;
                            if (length == 1) {
                                matcher = pattern.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new y6("Invalid number of entries for fontSize: " + length + ".");
                                }
                                matcher = pattern.matcher(strArrSplit[1]);
                                qs0.f("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new y6("Invalid expression for fontSize: '" + attributeValue + "'.");
                            }
                            String strGroup3 = matcher.group(3);
                            if (strGroup3 == null) {
                                throw null;
                            }
                            int iHashCode2 = strGroup3.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup3.equals("%")) {
                                    throw new y6("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                b8VarE.f2970j = 3;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                }
                            } else if (iHashCode2 != 3240) {
                                if (iHashCode2 != 3592 || !strGroup3.equals("px")) {
                                    throw new y6("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                b8VarE.f2970j = 1;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                    throw null;
                                }
                                b8VarE.f2971k = Float.parseFloat(strGroup);
                                break;
                            } else {
                                if (!strGroup3.equals("em")) {
                                    throw new y6("Invalid unit for fontSize: '" + strGroup3 + "'.");
                                }
                                b8VarE.f2970j = 2;
                                strGroup = matcher.group(1);
                                if (strGroup == null) {
                                }
                            }
                        } catch (y6 unused2) {
                            androidx.camera.core.t.d(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                            break;
                        }
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        b8VarE = e(b8VarE);
                        Pattern pattern2 = v7.f9737d;
                        if (attributeValue == null) {
                            v7Var = null;
                            b8VarE.f2978r = v7Var;
                            break;
                        } else {
                            String strG4 = rj1.g(attributeValue.trim());
                            if (!strG4.isEmpty()) {
                                String[] strArrSplit2 = TextUtils.split(strG4, v7.f9737d);
                                int length2 = strArrSplit2.length;
                                go1 go1VarM = length2 != 0 ? length2 != 1 ? go1.m((Object[]) strArrSplit2.clone(), length2) : new rp1(strArrSplit2[z6 ? 1 : 0]) : jp1.B;
                                String str = (String) ed0.j(rj1.l(v7.h, go1VarM), "outside");
                                int iHashCode3 = str.hashCode();
                                if (iHashCode3 != -1106037339) {
                                    i6 = (iHashCode3 == 92734940 && str.equals("after")) ? 2 : 1;
                                    np1VarL = rj1.l(v7.f9738e, go1VarM);
                                    if (np1VarL.isEmpty()) {
                                        String str2 = (String) new mp1(np1VarL.s, np1VarL.f7488t).next();
                                        if (str2.hashCode() == 3387192 && str2.equals("none")) {
                                            i7 = 0;
                                            i9 = 0;
                                        } else {
                                            i7 = 0;
                                        }
                                        v7Var = new v7(i9, i7, i6);
                                    } else {
                                        np1 np1VarL2 = rj1.l(v7.f9740g, go1VarM);
                                        np1 np1VarL3 = rj1.l(v7.f9739f, go1VarM);
                                        if (!np1VarL2.isEmpty() || !np1VarL3.isEmpty()) {
                                            String str3 = (String) ed0.j(np1VarL2, "filled");
                                            i7 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                                            String str4 = (String) ed0.j(np1VarL3, "circle");
                                            int iHashCode4 = str4.hashCode();
                                            if (iHashCode4 != -905816648) {
                                                i9 = (iHashCode4 == 99657 && str4.equals("dot")) ? 2 : 1;
                                            } else if (str4.equals("sesame")) {
                                                i9 = 3;
                                            }
                                        }
                                        v7Var = new v7(i9, i7, i6);
                                    }
                                } else {
                                    if (str.equals("outside")) {
                                        i6 = -2;
                                    }
                                    np1VarL = rj1.l(v7.f9738e, go1VarM);
                                    if (np1VarL.isEmpty()) {
                                    }
                                }
                            }
                            b8VarE.f2978r = v7Var;
                        }
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strG5 = rj1.g(attributeValue);
                        int iHashCode5 = strG5.hashCode();
                        if (iHashCode5 != -1392885889) {
                            if (iHashCode5 == 92734940 && strG5.equals("after")) {
                                b8VarE = e(b8VarE);
                                b8VarE.f2974n = 2;
                            }
                        } else if (strG5.equals("before")) {
                            b8VarE = e(b8VarE);
                            b8VarE.f2974n = 1;
                        }
                    } else {
                        continue;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        b8VarE = e(b8VarE);
                        try {
                            b8VarE.f2965d = zl0.a(attributeValue, z6);
                            b8VarE.f2966e = true;
                        } catch (IllegalArgumentException unused3) {
                            androidx.camera.core.t.d(attributeValue, "Failed parsing background value: ", "TtmlParser");
                        }
                    } else {
                        continue;
                    }
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        b8VarE = e(b8VarE);
                        b8VarE.f2976p = d(attributeValue);
                    } else {
                        continue;
                    }
                default:
            }
            z6 = false;
        }
        return b8VarE;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:277:0x0562. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c5 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TRY_LEAVE, TryCatch #19 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:3:0x0006, B:7:0x0058, B:9:0x0067, B:12:0x0073, B:15:0x0083, B:17:0x008b, B:23:0x0098, B:26:0x00a4, B:30:0x00b8, B:32:0x00d1, B:34:0x00dd, B:35:0x00e1, B:37:0x00ed, B:40:0x00f7, B:74:0x019b, B:93:0x01f4, B:96:0x0204, B:98:0x020a, B:100:0x0212, B:102:0x021a, B:104:0x0222, B:106:0x022a, B:108:0x0232, B:110:0x0238, B:112:0x0240, B:114:0x0248, B:116:0x024e, B:118:0x0254, B:120:0x025a, B:122:0x0262, B:125:0x026b, B:403:0x0760, B:126:0x0293, B:129:0x029b, B:131:0x02a4, B:133:0x02b5, B:135:0x02bf, B:137:0x02cf, B:139:0x02d5, B:141:0x02e9, B:143:0x02ef, B:268:0x050b, B:136:0x02c6, B:146:0x02fc, B:149:0x030a, B:151:0x0310, B:153:0x0319, B:155:0x031f, B:156:0x0326, B:159:0x032d, B:267:0x0504, B:162:0x033d, B:164:0x0345, B:168:0x0362, B:170:0x0368, B:172:0x0375, B:190:0x03bf, B:192:0x03c5, B:196:0x03d6, B:198:0x03dc, B:200:0x03e9, B:217:0x0431, B:219:0x0439, B:233:0x0474, B:235:0x047e, B:253:0x04b6, B:202:0x03f4, B:203:0x03f5, B:204:0x03f6, B:205:0x03fe, B:208:0x0406, B:211:0x0410, B:213:0x0416, B:215:0x0421, B:255:0x04c2, B:256:0x04c3, B:257:0x04c4, B:258:0x04cd, B:259:0x04d8, B:174:0x037e, B:175:0x037f, B:176:0x0380, B:178:0x038b, B:181:0x0395, B:184:0x039e, B:186:0x03a4, B:188:0x03af, B:261:0x04df, B:262:0x04e0, B:263:0x04e1, B:264:0x04ea, B:265:0x04f5, B:273:0x0534, B:276:0x0556, B:331:0x0649, B:281:0x0574, B:284:0x057d, B:372:0x06d5, B:295:0x05a5, B:298:0x05b0, B:300:0x05c9, B:299:0x05bb, B:314:0x05f9, B:320:0x0613, B:324:0x062b, B:328:0x0641, B:336:0x0662, B:340:0x066e, B:344:0x0677, B:352:0x068a, B:359:0x069a, B:361:0x06aa, B:363:0x06af, B:365:0x06b3, B:366:0x06ba, B:355:0x0691, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d4, B:88:0x01d5, B:89:0x01d6, B:45:0x0113, B:48:0x0123, B:51:0x012d, B:53:0x0133, B:55:0x013a, B:57:0x0140, B:63:0x0158, B:65:0x015f, B:73:0x0192, B:69:0x0183, B:72:0x0191, B:376:0x06fa, B:378:0x0706, B:379:0x070d, B:382:0x0716, B:385:0x071a, B:387:0x0724, B:389:0x072e, B:393:0x073a, B:391:0x0735, B:397:0x0752, B:401:0x075a, B:408:0x077b), top: B:442:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0439 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TRY_LEAVE, TryCatch #19 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:3:0x0006, B:7:0x0058, B:9:0x0067, B:12:0x0073, B:15:0x0083, B:17:0x008b, B:23:0x0098, B:26:0x00a4, B:30:0x00b8, B:32:0x00d1, B:34:0x00dd, B:35:0x00e1, B:37:0x00ed, B:40:0x00f7, B:74:0x019b, B:93:0x01f4, B:96:0x0204, B:98:0x020a, B:100:0x0212, B:102:0x021a, B:104:0x0222, B:106:0x022a, B:108:0x0232, B:110:0x0238, B:112:0x0240, B:114:0x0248, B:116:0x024e, B:118:0x0254, B:120:0x025a, B:122:0x0262, B:125:0x026b, B:403:0x0760, B:126:0x0293, B:129:0x029b, B:131:0x02a4, B:133:0x02b5, B:135:0x02bf, B:137:0x02cf, B:139:0x02d5, B:141:0x02e9, B:143:0x02ef, B:268:0x050b, B:136:0x02c6, B:146:0x02fc, B:149:0x030a, B:151:0x0310, B:153:0x0319, B:155:0x031f, B:156:0x0326, B:159:0x032d, B:267:0x0504, B:162:0x033d, B:164:0x0345, B:168:0x0362, B:170:0x0368, B:172:0x0375, B:190:0x03bf, B:192:0x03c5, B:196:0x03d6, B:198:0x03dc, B:200:0x03e9, B:217:0x0431, B:219:0x0439, B:233:0x0474, B:235:0x047e, B:253:0x04b6, B:202:0x03f4, B:203:0x03f5, B:204:0x03f6, B:205:0x03fe, B:208:0x0406, B:211:0x0410, B:213:0x0416, B:215:0x0421, B:255:0x04c2, B:256:0x04c3, B:257:0x04c4, B:258:0x04cd, B:259:0x04d8, B:174:0x037e, B:175:0x037f, B:176:0x0380, B:178:0x038b, B:181:0x0395, B:184:0x039e, B:186:0x03a4, B:188:0x03af, B:261:0x04df, B:262:0x04e0, B:263:0x04e1, B:264:0x04ea, B:265:0x04f5, B:273:0x0534, B:276:0x0556, B:331:0x0649, B:281:0x0574, B:284:0x057d, B:372:0x06d5, B:295:0x05a5, B:298:0x05b0, B:300:0x05c9, B:299:0x05bb, B:314:0x05f9, B:320:0x0613, B:324:0x062b, B:328:0x0641, B:336:0x0662, B:340:0x066e, B:344:0x0677, B:352:0x068a, B:359:0x069a, B:361:0x06aa, B:363:0x06af, B:365:0x06b3, B:366:0x06ba, B:355:0x0691, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d4, B:88:0x01d5, B:89:0x01d6, B:45:0x0113, B:48:0x0123, B:51:0x012d, B:53:0x0133, B:55:0x013a, B:57:0x0140, B:63:0x0158, B:65:0x015f, B:73:0x0192, B:69:0x0183, B:72:0x0191, B:376:0x06fa, B:378:0x0706, B:379:0x070d, B:382:0x0716, B:385:0x071a, B:387:0x0724, B:389:0x072e, B:393:0x073a, B:391:0x0735, B:397:0x0752, B:401:0x075a, B:408:0x077b), top: B:442:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x047e A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TRY_LEAVE, TryCatch #19 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:3:0x0006, B:7:0x0058, B:9:0x0067, B:12:0x0073, B:15:0x0083, B:17:0x008b, B:23:0x0098, B:26:0x00a4, B:30:0x00b8, B:32:0x00d1, B:34:0x00dd, B:35:0x00e1, B:37:0x00ed, B:40:0x00f7, B:74:0x019b, B:93:0x01f4, B:96:0x0204, B:98:0x020a, B:100:0x0212, B:102:0x021a, B:104:0x0222, B:106:0x022a, B:108:0x0232, B:110:0x0238, B:112:0x0240, B:114:0x0248, B:116:0x024e, B:118:0x0254, B:120:0x025a, B:122:0x0262, B:125:0x026b, B:403:0x0760, B:126:0x0293, B:129:0x029b, B:131:0x02a4, B:133:0x02b5, B:135:0x02bf, B:137:0x02cf, B:139:0x02d5, B:141:0x02e9, B:143:0x02ef, B:268:0x050b, B:136:0x02c6, B:146:0x02fc, B:149:0x030a, B:151:0x0310, B:153:0x0319, B:155:0x031f, B:156:0x0326, B:159:0x032d, B:267:0x0504, B:162:0x033d, B:164:0x0345, B:168:0x0362, B:170:0x0368, B:172:0x0375, B:190:0x03bf, B:192:0x03c5, B:196:0x03d6, B:198:0x03dc, B:200:0x03e9, B:217:0x0431, B:219:0x0439, B:233:0x0474, B:235:0x047e, B:253:0x04b6, B:202:0x03f4, B:203:0x03f5, B:204:0x03f6, B:205:0x03fe, B:208:0x0406, B:211:0x0410, B:213:0x0416, B:215:0x0421, B:255:0x04c2, B:256:0x04c3, B:257:0x04c4, B:258:0x04cd, B:259:0x04d8, B:174:0x037e, B:175:0x037f, B:176:0x0380, B:178:0x038b, B:181:0x0395, B:184:0x039e, B:186:0x03a4, B:188:0x03af, B:261:0x04df, B:262:0x04e0, B:263:0x04e1, B:264:0x04ea, B:265:0x04f5, B:273:0x0534, B:276:0x0556, B:331:0x0649, B:281:0x0574, B:284:0x057d, B:372:0x06d5, B:295:0x05a5, B:298:0x05b0, B:300:0x05c9, B:299:0x05bb, B:314:0x05f9, B:320:0x0613, B:324:0x062b, B:328:0x0641, B:336:0x0662, B:340:0x066e, B:344:0x0677, B:352:0x068a, B:359:0x069a, B:361:0x06aa, B:363:0x06af, B:365:0x06b3, B:366:0x06ba, B:355:0x0691, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d4, B:88:0x01d5, B:89:0x01d6, B:45:0x0113, B:48:0x0123, B:51:0x012d, B:53:0x0133, B:55:0x013a, B:57:0x0140, B:63:0x0158, B:65:0x015f, B:73:0x0192, B:69:0x0183, B:72:0x0191, B:376:0x06fa, B:378:0x0706, B:379:0x070d, B:382:0x0716, B:385:0x071a, B:387:0x0724, B:389:0x072e, B:393:0x073a, B:391:0x0735, B:397:0x0752, B:401:0x075a, B:408:0x077b), top: B:442:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04d8 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TRY_LEAVE, TryCatch #19 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:3:0x0006, B:7:0x0058, B:9:0x0067, B:12:0x0073, B:15:0x0083, B:17:0x008b, B:23:0x0098, B:26:0x00a4, B:30:0x00b8, B:32:0x00d1, B:34:0x00dd, B:35:0x00e1, B:37:0x00ed, B:40:0x00f7, B:74:0x019b, B:93:0x01f4, B:96:0x0204, B:98:0x020a, B:100:0x0212, B:102:0x021a, B:104:0x0222, B:106:0x022a, B:108:0x0232, B:110:0x0238, B:112:0x0240, B:114:0x0248, B:116:0x024e, B:118:0x0254, B:120:0x025a, B:122:0x0262, B:125:0x026b, B:403:0x0760, B:126:0x0293, B:129:0x029b, B:131:0x02a4, B:133:0x02b5, B:135:0x02bf, B:137:0x02cf, B:139:0x02d5, B:141:0x02e9, B:143:0x02ef, B:268:0x050b, B:136:0x02c6, B:146:0x02fc, B:149:0x030a, B:151:0x0310, B:153:0x0319, B:155:0x031f, B:156:0x0326, B:159:0x032d, B:267:0x0504, B:162:0x033d, B:164:0x0345, B:168:0x0362, B:170:0x0368, B:172:0x0375, B:190:0x03bf, B:192:0x03c5, B:196:0x03d6, B:198:0x03dc, B:200:0x03e9, B:217:0x0431, B:219:0x0439, B:233:0x0474, B:235:0x047e, B:253:0x04b6, B:202:0x03f4, B:203:0x03f5, B:204:0x03f6, B:205:0x03fe, B:208:0x0406, B:211:0x0410, B:213:0x0416, B:215:0x0421, B:255:0x04c2, B:256:0x04c3, B:257:0x04c4, B:258:0x04cd, B:259:0x04d8, B:174:0x037e, B:175:0x037f, B:176:0x0380, B:178:0x038b, B:181:0x0395, B:184:0x039e, B:186:0x03a4, B:188:0x03af, B:261:0x04df, B:262:0x04e0, B:263:0x04e1, B:264:0x04ea, B:265:0x04f5, B:273:0x0534, B:276:0x0556, B:331:0x0649, B:281:0x0574, B:284:0x057d, B:372:0x06d5, B:295:0x05a5, B:298:0x05b0, B:300:0x05c9, B:299:0x05bb, B:314:0x05f9, B:320:0x0613, B:324:0x062b, B:328:0x0641, B:336:0x0662, B:340:0x066e, B:344:0x0677, B:352:0x068a, B:359:0x069a, B:361:0x06aa, B:363:0x06af, B:365:0x06b3, B:366:0x06ba, B:355:0x0691, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d4, B:88:0x01d5, B:89:0x01d6, B:45:0x0113, B:48:0x0123, B:51:0x012d, B:53:0x0133, B:55:0x013a, B:57:0x0140, B:63:0x0158, B:65:0x015f, B:73:0x0192, B:69:0x0183, B:72:0x0191, B:376:0x06fa, B:378:0x0706, B:379:0x070d, B:382:0x0716, B:385:0x071a, B:387:0x0724, B:389:0x072e, B:393:0x073a, B:391:0x0735, B:397:0x0752, B:401:0x075a, B:408:0x077b), top: B:442:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0518 A[LOOP:1: B:129:0x029b->B:271:0x0518, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0511 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4 A[Catch: IOException -> 0x0090, XmlPullParserException -> 0x0093, TryCatch #19 {IOException -> 0x0090, XmlPullParserException -> 0x0093, blocks: (B:3:0x0006, B:7:0x0058, B:9:0x0067, B:12:0x0073, B:15:0x0083, B:17:0x008b, B:23:0x0098, B:26:0x00a4, B:30:0x00b8, B:32:0x00d1, B:34:0x00dd, B:35:0x00e1, B:37:0x00ed, B:40:0x00f7, B:74:0x019b, B:93:0x01f4, B:96:0x0204, B:98:0x020a, B:100:0x0212, B:102:0x021a, B:104:0x0222, B:106:0x022a, B:108:0x0232, B:110:0x0238, B:112:0x0240, B:114:0x0248, B:116:0x024e, B:118:0x0254, B:120:0x025a, B:122:0x0262, B:125:0x026b, B:403:0x0760, B:126:0x0293, B:129:0x029b, B:131:0x02a4, B:133:0x02b5, B:135:0x02bf, B:137:0x02cf, B:139:0x02d5, B:141:0x02e9, B:143:0x02ef, B:268:0x050b, B:136:0x02c6, B:146:0x02fc, B:149:0x030a, B:151:0x0310, B:153:0x0319, B:155:0x031f, B:156:0x0326, B:159:0x032d, B:267:0x0504, B:162:0x033d, B:164:0x0345, B:168:0x0362, B:170:0x0368, B:172:0x0375, B:190:0x03bf, B:192:0x03c5, B:196:0x03d6, B:198:0x03dc, B:200:0x03e9, B:217:0x0431, B:219:0x0439, B:233:0x0474, B:235:0x047e, B:253:0x04b6, B:202:0x03f4, B:203:0x03f5, B:204:0x03f6, B:205:0x03fe, B:208:0x0406, B:211:0x0410, B:213:0x0416, B:215:0x0421, B:255:0x04c2, B:256:0x04c3, B:257:0x04c4, B:258:0x04cd, B:259:0x04d8, B:174:0x037e, B:175:0x037f, B:176:0x0380, B:178:0x038b, B:181:0x0395, B:184:0x039e, B:186:0x03a4, B:188:0x03af, B:261:0x04df, B:262:0x04e0, B:263:0x04e1, B:264:0x04ea, B:265:0x04f5, B:273:0x0534, B:276:0x0556, B:331:0x0649, B:281:0x0574, B:284:0x057d, B:372:0x06d5, B:295:0x05a5, B:298:0x05b0, B:300:0x05c9, B:299:0x05bb, B:314:0x05f9, B:320:0x0613, B:324:0x062b, B:328:0x0641, B:336:0x0662, B:340:0x066e, B:344:0x0677, B:352:0x068a, B:359:0x069a, B:361:0x06aa, B:363:0x06af, B:365:0x06b3, B:366:0x06ba, B:355:0x0691, B:77:0x01a4, B:79:0x01ae, B:82:0x01b9, B:84:0x01bf, B:86:0x01ca, B:87:0x01d4, B:88:0x01d5, B:89:0x01d6, B:45:0x0113, B:48:0x0123, B:51:0x012d, B:53:0x0133, B:55:0x013a, B:57:0x0140, B:63:0x0158, B:65:0x015f, B:73:0x0192, B:69:0x0183, B:72:0x0191, B:376:0x06fa, B:378:0x0706, B:379:0x070d, B:382:0x0716, B:385:0x071a, B:387:0x0724, B:389:0x072e, B:393:0x073a, B:391:0x0735, B:397:0x0752, B:401:0x075a, B:408:0x077b), top: B:442:0x0006 }] */
    /* JADX WARN: Type inference failed for: r45v1, types: [com.google.android.gms.internal.ads.b8, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c8 a(int i6, int i7, byte[] bArr) throws XmlPullParserException, NumberFormatException, IOException, y6 {
        String str;
        String str2;
        HashMap map;
        HashMap map2;
        ArrayDeque arrayDeque;
        x7 x7Var;
        c8 c8Var;
        int i8;
        HashMap map3;
        w7 w7Var;
        ArrayDeque arrayDeque2;
        int i9;
        y7 y7Var;
        HashMap map4;
        x7 x7Var2;
        int i10;
        w7 w7Var2;
        w7 w7Var3;
        long j6;
        Object obj;
        String[] strArrSplit;
        String str3;
        String str4;
        String str5;
        x7 x7Var3;
        String str6;
        String str7;
        a8 a8Var;
        float f6;
        float f7;
        String strE;
        float f8;
        float f9;
        String strE2;
        float f10;
        int i11;
        String strE3;
        int i12;
        String strE4;
        String[] strArrSplit2;
        float f11;
        x7 x7Var4;
        String strGroup;
        String strGroup2;
        int i13;
        boolean z6;
        StringBuilder sb;
        String strE5;
        String strGroup3;
        String str8 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        String str9 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.s.newPullParser();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            HashMap map7 = new HashMap();
            map6.put(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new a8(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            Object obj2 = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i6, i7), null);
            ArrayDeque arrayDeque3 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            x7 x7Var5 = A;
            c8 c8Var2 = null;
            y7 y7Var2 = null;
            x7 x7Var6 = x7Var5;
            int i14 = 0;
            int i15 = 15;
            while (eventType != 1) {
                ?? r45 = obj2;
                w7 w7Var4 = (w7) arrayDeque3.peek();
                int i16 = 0;
                if (i14 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str8;
                    if (eventType == 2) {
                        boolean zEquals = "tt".equals(name);
                        Pattern pattern = f11199y;
                        c8 c8Var3 = c8Var2;
                        if (zEquals) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str9, "frameRate");
                            int i17 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str9, "frameRateMultiplier");
                            i9 = i14;
                            if (attributeValue2 != null) {
                                int i18 = j31.f5914a;
                                arrayDeque2 = arrayDeque3;
                                y5.p("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
                                f11 = Integer.parseInt(r15[0]) / Integer.parseInt(r15[1]);
                            } else {
                                arrayDeque2 = arrayDeque3;
                                f11 = 1.0f;
                            }
                            int i19 = x7Var5.f10397b;
                            float f12 = f11;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str9, "subFrameRate");
                            if (attributeValue3 != null) {
                                i19 = Integer.parseInt(attributeValue3);
                            }
                            int i20 = x7Var5.f10398c;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str9, "tickRate");
                            x7Var = x7Var5;
                            x7 x7Var7 = new x7(i17 * f12, i19, attributeValue4 != null ? Integer.parseInt(attributeValue4) : i20);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str9, "cellResolution");
                            if (attributeValue5 == null) {
                                str2 = str9;
                            } else {
                                Matcher matcher = f11200z.matcher(attributeValue5);
                                str2 = str9;
                                if (matcher.matches()) {
                                    try {
                                        strGroup = matcher.group(1);
                                    } catch (NumberFormatException unused) {
                                        map3 = map6;
                                        w7Var = w7Var4;
                                        x7Var4 = x7Var7;
                                    }
                                    if (strGroup == null) {
                                        throw r45;
                                    }
                                    int i21 = Integer.parseInt(strGroup);
                                    x7Var4 = x7Var7;
                                    try {
                                        strGroup2 = matcher.group(2);
                                    } catch (NumberFormatException unused2) {
                                        map3 = map6;
                                        w7Var = w7Var4;
                                    }
                                    if (strGroup2 == null) {
                                        throw r45;
                                    }
                                    int i22 = Integer.parseInt(strGroup2);
                                    if (i21 == 0) {
                                        w7Var = w7Var4;
                                        i13 = i22;
                                        z6 = false;
                                    } else if (i22 != 0) {
                                        w7Var = w7Var4;
                                        i13 = i22;
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                        i13 = 0;
                                        w7Var = w7Var4;
                                    }
                                    try {
                                        sb = new StringBuilder();
                                        map3 = map6;
                                    } catch (NumberFormatException unused3) {
                                        map3 = map6;
                                    }
                                    try {
                                        sb.append("Invalid cell resolution ");
                                        sb.append(i21);
                                        sb.append(" ");
                                        sb.append(i13);
                                        y5.p(sb.toString(), z6);
                                        i15 = i13;
                                    } catch (NumberFormatException unused4) {
                                        qs0.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                        i15 = 15;
                                        strE5 = y5.e(xmlPullParserNewPullParser, "extent");
                                        if (strE5 == null) {
                                        }
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        x7Var5 = x7Var;
                                        str9 = str2;
                                        obj2 = null;
                                        map6 = map2;
                                        map5 = map;
                                        str8 = str;
                                    }
                                    strE5 = y5.e(xmlPullParserNewPullParser, "extent");
                                    if (strE5 == null) {
                                        y7Var = r45;
                                        x7Var6 = x7Var4;
                                    } else {
                                        Matcher matcher2 = pattern.matcher(strE5);
                                        if (matcher2.matches()) {
                                            try {
                                                strGroup3 = matcher2.group(1);
                                            } catch (NumberFormatException unused5) {
                                                qs0.f("TtmlParser", "Ignoring malformed tts extent: ".concat(strE5));
                                            }
                                            if (strGroup3 == null) {
                                                throw r45;
                                            }
                                            int i23 = Integer.parseInt(strGroup3);
                                            String strGroup4 = matcher2.group(2);
                                            if (strGroup4 == null) {
                                                throw r45;
                                            }
                                            y7Var = new y7(i23, Integer.parseInt(strGroup4));
                                            x7Var6 = x7Var4;
                                        } else {
                                            qs0.f("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strE5));
                                        }
                                        y7Var = r45;
                                        x7Var6 = x7Var4;
                                    }
                                    xmlPullParserNewPullParser.next();
                                    eventType = xmlPullParserNewPullParser.getEventType();
                                    arrayDeque3 = arrayDeque;
                                    x7Var5 = x7Var;
                                    str9 = str2;
                                    obj2 = null;
                                    map6 = map2;
                                    map5 = map;
                                    str8 = str;
                                } else {
                                    qs0.f("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                }
                            }
                            map3 = map6;
                            w7Var = w7Var4;
                            x7Var4 = x7Var7;
                            i15 = 15;
                            strE5 = y5.e(xmlPullParserNewPullParser, "extent");
                            if (strE5 == null) {
                            }
                            xmlPullParserNewPullParser.next();
                            eventType = xmlPullParserNewPullParser.getEventType();
                            arrayDeque3 = arrayDeque;
                            x7Var5 = x7Var;
                            str9 = str2;
                            obj2 = null;
                            map6 = map2;
                            map5 = map;
                            str8 = str;
                        } else {
                            str2 = str9;
                            map3 = map6;
                            w7Var = w7Var4;
                            arrayDeque2 = arrayDeque3;
                            x7Var = x7Var5;
                            i9 = i14;
                            y7Var = y7Var2;
                        }
                        int i24 = i15;
                        String str10 = "image";
                        String str11 = "metadata";
                        String str12 = "style";
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            boolean zEquals2 = "head".equals(name);
                            String str13 = "\\s+";
                            if (zEquals2) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (y5.m(xmlPullParserNewPullParser, str12)) {
                                        String strE6 = y5.e(xmlPullParserNewPullParser, str12);
                                        x7Var3 = x7Var6;
                                        b8 b8VarF = f(xmlPullParserNewPullParser, new b8());
                                        if (strE6 != null) {
                                            String strTrim = strE6.trim();
                                            if (strTrim.isEmpty()) {
                                                str5 = str12;
                                                strArrSplit2 = new String[i16];
                                            } else {
                                                str5 = str12;
                                                int i25 = j31.f5914a;
                                                strArrSplit2 = strTrim.split(str13, -1);
                                            }
                                            int length = strArrSplit2.length;
                                            str4 = str13;
                                            int i26 = 0;
                                            while (i26 < length) {
                                                int i27 = i26;
                                                b8VarF.b((b8) map5.get(strArrSplit2[i27]));
                                                i26 = i27 + 1;
                                            }
                                        } else {
                                            str4 = str13;
                                            str5 = str12;
                                        }
                                        String strA = b8VarF.a();
                                        if (strA != null) {
                                            map5.put(strA, b8VarF);
                                        }
                                    } else {
                                        str4 = str13;
                                        str5 = str12;
                                        x7Var3 = x7Var6;
                                        if (y5.m(xmlPullParserNewPullParser, "region")) {
                                            String strE7 = y5.e(xmlPullParserNewPullParser, "id");
                                            if (strE7 == null) {
                                                a8Var = r45;
                                                str6 = str10;
                                                map4 = map5;
                                                str7 = str11;
                                            } else {
                                                String strE8 = y5.e(xmlPullParserNewPullParser, "origin");
                                                if (strE8 != null) {
                                                    Pattern pattern2 = f11198x;
                                                    Matcher matcher3 = pattern2.matcher(strE8);
                                                    Matcher matcher4 = pattern.matcher(strE8);
                                                    str6 = str10;
                                                    str7 = str11;
                                                    if (matcher3.matches()) {
                                                        map4 = map5;
                                                        try {
                                                            String strGroup5 = matcher3.group(1);
                                                            if (strGroup5 == null) {
                                                                throw r45;
                                                            }
                                                            f6 = Float.parseFloat(strGroup5) / 100.0f;
                                                            String strGroup6 = matcher3.group(2);
                                                            if (strGroup6 == null) {
                                                                throw r45;
                                                            }
                                                            f7 = Float.parseFloat(strGroup6) / 100.0f;
                                                            float f13 = f6;
                                                            strE = y5.e(xmlPullParserNewPullParser, "extent");
                                                            if (strE == null) {
                                                                Matcher matcher5 = pattern2.matcher(strE);
                                                                Matcher matcher6 = pattern.matcher(strE);
                                                                if (matcher5.matches()) {
                                                                    try {
                                                                        String strGroup7 = matcher5.group(1);
                                                                        if (strGroup7 == null) {
                                                                            throw r45;
                                                                        }
                                                                        f8 = Float.parseFloat(strGroup7) / 100.0f;
                                                                        String strGroup8 = matcher5.group(2);
                                                                        if (strGroup8 == null) {
                                                                            throw r45;
                                                                        }
                                                                        f9 = Float.parseFloat(strGroup8) / 100.0f;
                                                                        float f14 = f9;
                                                                        float f15 = f8;
                                                                        strE2 = y5.e(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strE2 == null) {
                                                                            String strG = rj1.g(strE2);
                                                                            int iHashCode = strG.hashCode();
                                                                            if (iHashCode != -1364013995) {
                                                                                if (iHashCode == 92734940 && strG.equals("after")) {
                                                                                    f10 = f7 + f14;
                                                                                    i11 = 2;
                                                                                } else {
                                                                                    f10 = f7;
                                                                                    i11 = 0;
                                                                                }
                                                                                float f16 = 1.0f / i24;
                                                                                strE3 = y5.e(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strE3 == null) {
                                                                                    String strG2 = rj1.g(strE3);
                                                                                    int iHashCode2 = strG2.hashCode();
                                                                                    if (iHashCode2 != 3694) {
                                                                                        if (iHashCode2 != 3553396) {
                                                                                            if (iHashCode2 == 3553576 && strG2.equals("tbrl")) {
                                                                                                i12 = 1;
                                                                                            }
                                                                                        } else if (strG2.equals("tblr")) {
                                                                                            i12 = 2;
                                                                                        }
                                                                                        i12 = Integer.MIN_VALUE;
                                                                                    } else if (!strG2.equals("tb")) {
                                                                                        i12 = Integer.MIN_VALUE;
                                                                                    }
                                                                                    a8Var = new a8(strE7, f13, f10, 0, i11, f15, f14, 1, f16, i12);
                                                                                }
                                                                            } else {
                                                                                if (strG.equals("center")) {
                                                                                    f10 = f7 + (f14 / 2.0f);
                                                                                    i11 = 1;
                                                                                }
                                                                                float f162 = 1.0f / i24;
                                                                                strE3 = y5.e(xmlPullParserNewPullParser, "writingMode");
                                                                                if (strE3 == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (NumberFormatException unused6) {
                                                                        qs0.f("TtmlParser", "Ignoring region with malformed extent: ".concat(strE8));
                                                                    }
                                                                } else if (!matcher6.matches()) {
                                                                    qs0.f("TtmlParser", "Ignoring region with unsupported extent: ".concat(strE8));
                                                                } else if (y7Var == null) {
                                                                    qs0.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strE8));
                                                                } else {
                                                                    try {
                                                                        String strGroup9 = matcher6.group(1);
                                                                        if (strGroup9 == null) {
                                                                            throw r45;
                                                                        }
                                                                        int i28 = Integer.parseInt(strGroup9);
                                                                        String strGroup10 = matcher6.group(2);
                                                                        if (strGroup10 == null) {
                                                                            throw r45;
                                                                        }
                                                                        f8 = i28 / y7Var.f10875a;
                                                                        f9 = Integer.parseInt(strGroup10) / y7Var.f10876b;
                                                                        float f142 = f9;
                                                                        float f152 = f8;
                                                                        strE2 = y5.e(xmlPullParserNewPullParser, "displayAlign");
                                                                        if (strE2 == null) {
                                                                        }
                                                                    } catch (NumberFormatException unused7) {
                                                                        qs0.f("TtmlParser", "Ignoring region with malformed extent: ".concat(strE8));
                                                                    }
                                                                }
                                                            } else {
                                                                qs0.f("TtmlParser", "Ignoring region without an extent");
                                                            }
                                                        } catch (NumberFormatException unused8) {
                                                            qs0.f("TtmlParser", "Ignoring region with malformed origin: ".concat(strE8));
                                                        }
                                                    } else {
                                                        map4 = map5;
                                                        if (!matcher4.matches()) {
                                                            qs0.f("TtmlParser", "Ignoring region with unsupported origin: ".concat(strE8));
                                                        } else if (y7Var == null) {
                                                            qs0.f("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strE8));
                                                        } else {
                                                            try {
                                                                String strGroup11 = matcher4.group(1);
                                                                if (strGroup11 == null) {
                                                                    throw r45;
                                                                }
                                                                int i29 = Integer.parseInt(strGroup11);
                                                                String strGroup12 = matcher4.group(2);
                                                                if (strGroup12 == null) {
                                                                    throw r45;
                                                                }
                                                                f6 = i29 / y7Var.f10875a;
                                                                f7 = Integer.parseInt(strGroup12) / y7Var.f10876b;
                                                                float f132 = f6;
                                                                strE = y5.e(xmlPullParserNewPullParser, "extent");
                                                                if (strE == null) {
                                                                }
                                                            } catch (NumberFormatException unused9) {
                                                                qs0.f("TtmlParser", "Ignoring region with malformed origin: ".concat(strE8));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    str6 = str10;
                                                    map4 = map5;
                                                    str7 = str11;
                                                    qs0.f("TtmlParser", "Ignoring region without an origin");
                                                }
                                                a8Var = r45;
                                            }
                                            if (a8Var != null) {
                                                map2 = map3;
                                                map2.put(a8Var.f2603a, a8Var);
                                            } else {
                                                map2 = map3;
                                            }
                                            if (y5.i(xmlPullParserNewPullParser, "head")) {
                                                map3 = map2;
                                                x7Var6 = x7Var3;
                                                str12 = str5;
                                                str13 = str4;
                                                str10 = str6;
                                                str11 = str7;
                                                map5 = map4;
                                                i16 = 0;
                                            } else {
                                                x7Var2 = x7Var3;
                                                arrayDeque = arrayDeque2;
                                            }
                                        } else if (y5.m(xmlPullParserNewPullParser, str11)) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (y5.m(xmlPullParserNewPullParser, str10) && (strE4 = y5.e(xmlPullParserNewPullParser, "id")) != null) {
                                                    map7.put(strE4, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!y5.i(xmlPullParserNewPullParser, str11));
                                        }
                                    }
                                    str6 = str10;
                                    map4 = map5;
                                    str7 = str11;
                                    map2 = map3;
                                    if (y5.i(xmlPullParserNewPullParser, "head")) {
                                    }
                                }
                            } else {
                                map4 = map5;
                                String str14 = "\\s+";
                                Object obj3 = "style";
                                x7 x7Var8 = x7Var6;
                                map2 = map3;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    b8 b8VarF2 = f(xmlPullParserNewPullParser, r45);
                                    String str15 = str;
                                    int i30 = 0;
                                    long jC = -9223372036854775807L;
                                    long jC2 = -9223372036854775807L;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    long jC3 = -9223372036854775807L;
                                    while (i30 < attributeCount) {
                                        try {
                                            String attributeName = xmlPullParserNewPullParser.getAttributeName(i30);
                                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i30);
                                            switch (attributeName.hashCode()) {
                                                case -934795532:
                                                    x7Var2 = x7Var8;
                                                    obj = obj3;
                                                    i10 = 1;
                                                    if (attributeName.equals("region") && map2.containsKey(attributeValue6)) {
                                                        str15 = attributeValue6;
                                                    }
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                    break;
                                                case 99841:
                                                    x7Var2 = x7Var8;
                                                    obj = obj3;
                                                    i10 = 1;
                                                    if (attributeName.equals("dur")) {
                                                        jC3 = c(attributeValue6, x7Var2);
                                                    }
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                case 100571:
                                                    x7Var2 = x7Var8;
                                                    obj = obj3;
                                                    i10 = 1;
                                                    if (attributeName.equals("end")) {
                                                        jC = c(attributeValue6, x7Var2);
                                                    }
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                case 93616297:
                                                    obj = obj3;
                                                    i10 = 1;
                                                    if (attributeName.equals("begin")) {
                                                        x7Var2 = x7Var8;
                                                        try {
                                                            jC2 = c(attributeValue6, x7Var2);
                                                        } catch (y6 e6) {
                                                            e = e6;
                                                            arrayDeque = arrayDeque2;
                                                            qs0.g("TtmlParser", "Suppressing parser error", e);
                                                            i15 = i24;
                                                            y7Var2 = y7Var;
                                                            i14 = i10;
                                                            c8Var2 = c8Var3;
                                                            map = map4;
                                                            x7Var6 = x7Var2;
                                                            xmlPullParserNewPullParser.next();
                                                            eventType = xmlPullParserNewPullParser.getEventType();
                                                            arrayDeque3 = arrayDeque;
                                                            x7Var5 = x7Var;
                                                            str9 = str2;
                                                            obj2 = null;
                                                            map6 = map2;
                                                            map5 = map;
                                                            str8 = str;
                                                        }
                                                    } else {
                                                        x7Var2 = x7Var8;
                                                    }
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                case 109780401:
                                                    obj = obj3;
                                                    i10 = 1;
                                                    if (attributeName.equals(obj)) {
                                                        try {
                                                            String strTrim2 = attributeValue6.trim();
                                                            if (strTrim2.isEmpty()) {
                                                                try {
                                                                    strArrSplit = new String[0];
                                                                    str3 = str14;
                                                                } catch (y6 e7) {
                                                                    e = e7;
                                                                    x7Var2 = x7Var8;
                                                                    arrayDeque = arrayDeque2;
                                                                    qs0.g("TtmlParser", "Suppressing parser error", e);
                                                                    i15 = i24;
                                                                    y7Var2 = y7Var;
                                                                    i14 = i10;
                                                                    c8Var2 = c8Var3;
                                                                    map = map4;
                                                                    x7Var6 = x7Var2;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    arrayDeque3 = arrayDeque;
                                                                    x7Var5 = x7Var;
                                                                    str9 = str2;
                                                                    obj2 = null;
                                                                    map6 = map2;
                                                                    map5 = map;
                                                                    str8 = str;
                                                                }
                                                            } else {
                                                                int i31 = j31.f5914a;
                                                                str3 = str14;
                                                                strArrSplit = strTrim2.split(str3, -1);
                                                            }
                                                            if (strArrSplit.length > 0) {
                                                                strArr = strArrSplit;
                                                            }
                                                            str14 = str3;
                                                        } catch (y6 e8) {
                                                            e = e8;
                                                        }
                                                    }
                                                    x7Var2 = x7Var8;
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                case 1292595405:
                                                    if (attributeName.equals("backgroundImage")) {
                                                        try {
                                                            if (attributeValue6.startsWith("#")) {
                                                                i10 = 1;
                                                                try {
                                                                    strSubstring = attributeValue6.substring(1);
                                                                } catch (y6 e9) {
                                                                    e = e9;
                                                                    x7Var2 = x7Var8;
                                                                    arrayDeque = arrayDeque2;
                                                                    qs0.g("TtmlParser", "Suppressing parser error", e);
                                                                    i15 = i24;
                                                                    y7Var2 = y7Var;
                                                                    i14 = i10;
                                                                    c8Var2 = c8Var3;
                                                                    map = map4;
                                                                    x7Var6 = x7Var2;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    arrayDeque3 = arrayDeque;
                                                                    x7Var5 = x7Var;
                                                                    str9 = str2;
                                                                    obj2 = null;
                                                                    map6 = map2;
                                                                    map5 = map;
                                                                    str8 = str;
                                                                }
                                                            } else {
                                                                i10 = 1;
                                                            }
                                                            x7Var2 = x7Var8;
                                                            obj = obj3;
                                                        } catch (y6 e10) {
                                                            e = e10;
                                                            i10 = 1;
                                                        }
                                                    }
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                                default:
                                                    x7Var2 = x7Var8;
                                                    obj = obj3;
                                                    i10 = 1;
                                                    i30++;
                                                    obj3 = obj;
                                                    x7Var8 = x7Var2;
                                            }
                                        } catch (y6 e11) {
                                            e = e11;
                                            x7Var2 = x7Var8;
                                            i10 = 1;
                                        }
                                    }
                                    x7Var2 = x7Var8;
                                    i10 = 1;
                                    long j7 = -9223372036854775807L;
                                    if (w7Var != null) {
                                        w7Var2 = w7Var;
                                        long j8 = w7Var2.f10081d;
                                        if (j8 == -9223372036854775807L) {
                                            w7Var3 = w7Var2;
                                        } else {
                                            jC2 = jC2 != -9223372036854775807L ? jC2 + j8 : -9223372036854775807L;
                                            if (jC != -9223372036854775807L) {
                                                jC += j8;
                                                w7Var3 = w7Var2;
                                            } else {
                                                w7Var3 = w7Var2;
                                                jC = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        w7Var2 = w7Var;
                                        w7Var3 = null;
                                    }
                                    if (jC == -9223372036854775807L) {
                                        if (jC3 != -9223372036854775807L) {
                                            j6 = jC2 + jC3;
                                        } else if (w7Var3 != null) {
                                            j6 = w7Var3.f10082e;
                                            if (j6 != -9223372036854775807L) {
                                            }
                                        }
                                        j7 = j6;
                                    } else {
                                        j7 = jC;
                                    }
                                    w7 w7VarB = w7.b(xmlPullParserNewPullParser.getName(), jC2, j7, b8VarF2, strArr, str15, strSubstring, w7Var3);
                                    arrayDeque = arrayDeque2;
                                    try {
                                        arrayDeque.push(w7VarB);
                                        if (w7Var2 != null) {
                                            if (w7Var2.f10089m == null) {
                                                w7Var2.f10089m = new ArrayList();
                                            }
                                            w7Var2.f10089m.add(w7VarB);
                                        }
                                    } catch (y6 e12) {
                                        e = e12;
                                        qs0.g("TtmlParser", "Suppressing parser error", e);
                                        i15 = i24;
                                        y7Var2 = y7Var;
                                        i14 = i10;
                                        c8Var2 = c8Var3;
                                        map = map4;
                                        x7Var6 = x7Var2;
                                        xmlPullParserNewPullParser.next();
                                        eventType = xmlPullParserNewPullParser.getEventType();
                                        arrayDeque3 = arrayDeque;
                                        x7Var5 = x7Var;
                                        str9 = str2;
                                        obj2 = null;
                                        map6 = map2;
                                        map5 = map;
                                        str8 = str;
                                    }
                                } catch (y6 e13) {
                                    e = e13;
                                    x7Var2 = x7Var8;
                                    arrayDeque = arrayDeque2;
                                    i10 = 1;
                                }
                            }
                            i15 = i24;
                            y7Var2 = y7Var;
                            x7Var6 = x7Var2;
                            c8Var2 = c8Var3;
                            i14 = i9;
                            map = map4;
                        } else {
                            qs0.e("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i15 = i24;
                            map = map5;
                            y7Var2 = y7Var;
                            c8Var2 = c8Var3;
                            arrayDeque = arrayDeque2;
                            map2 = map3;
                            i14 = 1;
                        }
                        xmlPullParserNewPullParser.next();
                        eventType = xmlPullParserNewPullParser.getEventType();
                        arrayDeque3 = arrayDeque;
                        x7Var5 = x7Var;
                        str9 = str2;
                        obj2 = null;
                        map6 = map2;
                        map5 = map;
                        str8 = str;
                    } else {
                        str2 = str9;
                        HashMap map8 = map5;
                        map2 = map6;
                        arrayDeque = arrayDeque3;
                        x7Var = x7Var5;
                        c8Var = c8Var2;
                        i8 = i14;
                        if (eventType == 4) {
                            if (w7Var4 == null) {
                                throw null;
                            }
                            w7 w7VarC = w7.c(xmlPullParserNewPullParser.getText());
                            if (w7Var4.f10089m == null) {
                                w7Var4.f10089m = new ArrayList();
                            }
                            w7Var4.f10089m.add(w7VarC);
                        } else if (eventType == 3) {
                            if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                w7 w7Var5 = (w7) arrayDeque.peek();
                                if (w7Var5 == null) {
                                    throw null;
                                }
                                map = map8;
                                c8Var2 = new c8(w7Var5, map, map2, map7);
                            } else {
                                map = map8;
                                c8Var2 = c8Var;
                            }
                            arrayDeque.pop();
                        }
                        map = map8;
                        c8Var2 = c8Var;
                    }
                } else {
                    str = str8;
                    str2 = str9;
                    map = map5;
                    map2 = map6;
                    arrayDeque = arrayDeque3;
                    x7Var = x7Var5;
                    c8Var = c8Var2;
                    i8 = i14;
                    if (eventType == 2) {
                        i14 = i8 + 1;
                    } else {
                        if (eventType == 3) {
                            i14 = i8 - 1;
                        }
                        c8Var2 = c8Var;
                    }
                    c8Var2 = c8Var;
                    xmlPullParserNewPullParser.next();
                    eventType = xmlPullParserNewPullParser.getEventType();
                    arrayDeque3 = arrayDeque;
                    x7Var5 = x7Var;
                    str9 = str2;
                    obj2 = null;
                    map6 = map2;
                    map5 = map;
                    str8 = str;
                }
                i14 = i8;
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque3 = arrayDeque;
                x7Var5 = x7Var;
                str9 = str2;
                obj2 = null;
                map6 = map2;
                map5 = map;
                str8 = str;
            }
            c8 c8Var4 = c8Var2;
            if (c8Var4 != null) {
                return c8Var4;
            }
            throw null;
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }

    @Override // com.google.android.gms.internal.ads.a7
    public final void b(byte[] bArr, int i6, int i7, c7 c7Var) {
        me0.g(a(i6, i7, bArr), c7Var);
    }
}
