package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.w;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f6748a;

    static {
        char[] cArr = new char[80];
        f6748a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f6748a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i10, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
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
            h.f fVar = h.f6665b;
            sb.append(l1.a(new h.f(((String) obj).getBytes(y.f6818a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof h) {
            sb.append(": \"");
            sb.append(l1.a((h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof w) {
            sb.append(" {");
            c((w) obj, sb, i10 + 2);
            sb.append("\n");
            a(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb, i12, "key", entry.getKey());
        b(sb, i12, "value", entry.getValue());
        sb.append("\n");
        a(i10, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(w wVar, StringBuilder sb, int i10) {
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = wVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6977d) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6977d) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i10, p3.c.a(4, 0, strSubstring), w.l(method2, wVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, p3.c.a(3, 0, strSubstring), w.l(method, wVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        Method method4 = (Method) entry.getValue();
                        Method method5 = (Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objL = w.l(method4, wVar, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objL instanceof Boolean) {
                                    zEquals = !((Boolean) objL).booleanValue();
                                } else if (objL instanceof Integer) {
                                    zEquals = ((Integer) objL).intValue() == 0;
                                } else if (objL instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objL).floatValue()) == 0) {
                                    }
                                } else if (objL instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objL).doubleValue()) == 0) {
                                    }
                                } else if (objL instanceof String) {
                                    zEquals = objL.equals("");
                                } else if (objL instanceof h) {
                                    zEquals = objL.equals(h.f6665b);
                                } else if (!(objL instanceof p0) ? !(objL instanceof Enum) || ((Enum) objL).ordinal() != 0 : objL != ((p0) objL).getDefaultInstanceForType()) {
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) w.l(method5, wVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i10, strSubstring, objL);
                            }
                        }
                    }
                }
            }
            i11 = 3;
        }
        if (wVar instanceof w.c) {
            Iterator<Map.Entry<T, Object>> itF = ((w.c) wVar).extensions.f();
            while (itF.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itF.next();
                ((w.d) entry2.getKey()).getClass();
                b(sb, i10, "[0]", entry2.getValue());
            }
        }
        o1 o1Var = wVar.unknownFields;
        if (o1Var != null) {
            for (int i13 = 0; i13 < o1Var.f6738a; i13++) {
                b(sb, i10, String.valueOf(o1Var.f6739b[i13] >>> 3), o1Var.f6740c[i13]);
            }
        }
    }
}
