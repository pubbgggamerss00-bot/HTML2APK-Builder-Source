package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o62 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f7622a;

    static {
        char[] cArr = new char[80];
        f7622a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i6, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i6, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i6, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i6, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i7 = 1; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            e42 e42Var = g42.f4896t;
            sb.append(iu1.f(new e42(((String) obj).getBytes(s52.f8801a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof g42) {
            sb.append(": \"");
            sb.append(iu1.f((g42) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof j52) {
            sb.append(" {");
            c((j52) obj, sb, i6 + 2);
            sb.append("\n");
            b(i6, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i8 = i6 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i8, "key", entry.getKey());
        a(sb, i8, "value", entry.getValue());
        sb.append("\n");
        b(i6, sb);
        sb.append("}");
    }

    public static void b(int i6, StringBuilder sb) {
        while (i6 > 0) {
            int i7 = 80;
            if (i6 <= 80) {
                i7 = i6;
            }
            sb.append(f7622a, 0, i7);
            i6 -= i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(j52 j52Var, StringBuilder sb, int i6) {
        int i7;
        int i8;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = j52Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i9 = 0;
        while (true) {
            i7 = 3;
            if (i9 >= length) {
                break;
            }
            Method method3 = declaredMethods[i9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i7);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i8 = i7;
            } else {
                i8 = i7;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i6, strSubstring.substring(0, strSubstring.length() - 4), j52.n(method2, j52Var, new Object[0]));
                }
                i7 = i8;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i6, strSubstring.substring(0, strSubstring.length() - 3), j52.n(method, j52Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objN = j52.n(method4, j52Var, new Object[0]);
                    if (method5 == null) {
                        if (objN instanceof Boolean) {
                            if (((Boolean) objN).booleanValue()) {
                                a(sb, i6, strSubstring, objN);
                            }
                        } else if (objN instanceof Integer) {
                            if (((Integer) objN).intValue() != 0) {
                            }
                        } else if (objN instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objN).floatValue()) != 0) {
                            }
                        } else if (!(objN instanceof Double)) {
                            if (objN instanceof String) {
                                zEquals = objN.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            } else if (objN instanceof g42) {
                                zEquals = objN.equals(g42.f4896t);
                            } else if (objN instanceof m62) {
                                if (objN != ((m62) objN).a()) {
                                }
                            } else if (!(objN instanceof Enum) || ((Enum) objN).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objN).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) j52.n(method5, j52Var, new Object[0])).booleanValue()) {
                    }
                }
            }
            i7 = i8;
        }
        if (j52Var instanceof g52) {
            Iterator itB = ((g52) j52Var).zza.b();
            while (itB.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itB.next();
                ((h52) entry2.getKey()).getClass();
                a(sb, i6, "[0]", entry2.getValue());
            }
        }
        m72 m72Var = j52Var.zzt;
        if (m72Var != null) {
            for (int i10 = 0; i10 < m72Var.f6959a; i10++) {
                a(sb, i6, String.valueOf(m72Var.f6960b[i10] >>> 3), m72Var.f6961c[i10]);
            }
        }
    }
}
