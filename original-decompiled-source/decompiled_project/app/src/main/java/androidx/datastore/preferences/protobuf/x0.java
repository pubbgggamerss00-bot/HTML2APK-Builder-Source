package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2169a;

    static {
        char[] cArr = new char[80];
        f2169a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(f2169a, 0, i11);
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
            sb.append(u1.b(j.d((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof j) {
            sb.append(": \"");
            sb.append(u1.b((j) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            c((GeneratedMessageLite) obj, sb, i10 + 2);
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
    public static void c(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i10) {
        int i11;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i12];
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
            if (strSubstring.endsWith(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6977d) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f6977d) && (method2 = (java.lang.reflect.Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i10, p3.c.a(4, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method2, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (java.lang.reflect.Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i10, p3.c.a(3, 0, strSubstring), GeneratedMessageLite.invokeOrDie(method, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                        if (method4 != null) {
                            Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, generatedMessageLite, new Object[0]);
                            if (method5 == null) {
                                zBooleanValue = true;
                                if (objInvokeOrDie instanceof Boolean) {
                                    zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                                } else if (objInvokeOrDie instanceof Integer) {
                                    zEquals = ((Integer) objInvokeOrDie).intValue() == 0;
                                } else if (objInvokeOrDie instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objInvokeOrDie).floatValue()) == 0) {
                                    }
                                } else if (objInvokeOrDie instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objInvokeOrDie).doubleValue()) == 0) {
                                    }
                                } else if (objInvokeOrDie instanceof String) {
                                    zEquals = objInvokeOrDie.equals("");
                                } else if (objInvokeOrDie instanceof j) {
                                    zEquals = objInvokeOrDie.equals(j.f2038b);
                                } else if (!(objInvokeOrDie instanceof MessageLite) ? !(objInvokeOrDie instanceof java.lang.Enum) || ((java.lang.Enum) objInvokeOrDie).ordinal() != 0 : objInvokeOrDie != ((MessageLite) objInvokeOrDie).getDefaultInstanceForType()) {
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, generatedMessageLite, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb, i10, strSubstring, objInvokeOrDie);
                            }
                        }
                    }
                }
            }
            i11 = 3;
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> itL = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.l();
            while (itL.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itL.next();
                b(sb, i10, x0.a.a(new StringBuilder("["), ((GeneratedMessageLite.b) entry2.getKey()).f1917a, "]"), entry2.getValue());
            }
        }
        x1 x1Var = generatedMessageLite.unknownFields;
        if (x1Var != null) {
            for (int i13 = 0; i13 < x1Var.f2171a; i13++) {
                b(sb, i10, String.valueOf(x1Var.f2172b[i13] >>> 3), x1Var.f2173c[i13]);
            }
        }
    }
}
