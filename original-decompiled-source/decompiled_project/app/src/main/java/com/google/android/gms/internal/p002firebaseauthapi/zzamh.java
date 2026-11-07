package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p3.c;
import v5.b;

/* loaded from: classes2.dex */
final class zzamh {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzamc zzamcVar, String str) throws SecurityException {
        StringBuilder sbA = b.a("# ", str);
        zza(zzamcVar, sbA, 0);
        return sbA.toString();
    }

    private static void zza(int i10, StringBuilder sb) {
        while (i10 > 0) {
            char[] cArr = zza;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb.append(cArr, 0, length);
            i10 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i10, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i10, sb);
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
            sb.append(zzanh.zza(zzajp.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzajp) {
            sb.append(": \"");
            sb.append(zzanh.zza((zzajp) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaky) {
            sb.append(" {");
            zza((zzaky) obj, sb, i10 + 2);
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            zza(sb, i12, "key", entry.getKey());
            zza(sb, i12, "value", entry.getValue());
            sb.append("\n");
            zza(i10, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzamc zzamcVar, StringBuilder sb, int i10) throws SecurityException {
        int i11;
        int i12;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzamcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
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
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith(e.f6977d) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(e.f6977d) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zza(sb, i10, c.a(4, 0, strSubstring), zzaky.zza(method2, zzamcVar, new Object[0]));
                i11 = 3;
            } else {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i12 = 3;
                    zza(sb, i10, c.a(3, 0, strSubstring), zzaky.zza(method, zzamcVar, new Object[0]));
                } else {
                    i12 = 3;
                    if (hashSet.contains("set".concat(strSubstring))) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + c.a(5, 0, strSubstring))) {
                                Method method4 = (Method) entry.getValue();
                                Method method5 = (Method) map.get("has".concat(strSubstring));
                                if (method4 != null) {
                                    Object objZza = zzaky.zza(method4, zzamcVar, new Object[0]);
                                    if (method5 == null) {
                                        zBooleanValue = true;
                                        if (objZza instanceof Boolean) {
                                            zEquals = !((Boolean) objZza).booleanValue();
                                        } else if (objZza instanceof Integer) {
                                            if (((Integer) objZza).intValue() == 0) {
                                            }
                                        } else if (objZza instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                            }
                                        } else if (objZza instanceof Double) {
                                            if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                            }
                                        } else if (objZza instanceof String) {
                                            zEquals = objZza.equals("");
                                        } else if (objZza instanceof zzajp) {
                                            zEquals = objZza.equals(zzajp.zza);
                                        } else if (!(objZza instanceof zzamc) ? !(objZza instanceof Enum) || ((Enum) objZza).ordinal() != 0 : objZza != ((zzamc) objZza).zzg()) {
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((Boolean) zzaky.zza(method5, zzamcVar, new Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        zza(sb, i10, strSubstring, objZza);
                                    }
                                }
                            }
                        }
                    }
                }
                i11 = i12;
            }
        }
        if (zzamcVar instanceof zzaky.zzb) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzaky.zzb) zzamcVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzann zzannVar = ((zzaky) zzamcVar).zzb;
        if (zzannVar != null) {
            zzannVar.zza(sb, i10);
        }
    }
}
