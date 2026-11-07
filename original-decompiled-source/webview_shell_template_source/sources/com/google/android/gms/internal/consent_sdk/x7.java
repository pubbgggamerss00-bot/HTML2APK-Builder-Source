package com.google.android.gms.internal.consent_sdk;

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
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11935a;

    static {
        char[] cArr = new char[80];
        f11935a = cArr;
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
            g6 g6Var = h6.f11768t;
            sb.append(m3.a(new g6(((String) obj).getBytes(e7.f11716a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof h6) {
            sb.append(": \"");
            sb.append(m3.a((h6) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof z6) {
            sb.append(" {");
            c((z6) obj, sb, i6 + 2);
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
            sb.append(f11935a, 0, i7);
            i6 -= i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(z6 z6Var, StringBuilder sb, int i6) {
        int i7;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = z6Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i8 = 0;
        while (true) {
            i7 = 3;
            if (i8 >= length) {
                break;
            }
            Method method3 = declaredMethods[i8];
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
            i8++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i7);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i6, strSubstring.substring(0, strSubstring.length() - 4), z6.i(method2, z6Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i6, strSubstring.substring(0, strSubstring.length() - 3), z6.i(method, z6Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objI = z6.i(method4, z6Var, new Object[0]);
                    if (method5 == null) {
                        if (objI instanceof Boolean) {
                            if (((Boolean) objI).booleanValue()) {
                                a(sb, i6, strSubstring, objI);
                            }
                        } else if (objI instanceof Integer) {
                            if (((Integer) objI).intValue() != 0) {
                            }
                        } else if (objI instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objI).floatValue()) != 0) {
                            }
                        } else if (!(objI instanceof Double)) {
                            if (objI instanceof String) {
                                zEquals = objI.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            } else if (objI instanceof h6) {
                                zEquals = objI.equals(h6.f11768t);
                            } else if (objI instanceof v7) {
                                if (objI != ((v7) objI).zzl()) {
                                }
                            } else if (!(objI instanceof Enum) || ((Enum) objI).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objI).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) z6.i(method5, z6Var, new Object[0])).booleanValue()) {
                    }
                }
            }
            i7 = 3;
        }
        if (z6Var instanceof x6) {
            Iterator itB = ((x6) z6Var).zzb.b();
            if (itB.hasNext()) {
                throw null;
            }
        }
    }
}
