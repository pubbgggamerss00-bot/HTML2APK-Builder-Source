package com.google.android.recaptcha.internal;

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
final class zzok {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzoi zzoiVar, String str) throws SecurityException {
        StringBuilder sbA = v5.b.a("# ", str);
        zzd(zzoiVar, sbA, 0);
        return sbA.toString();
    }

    public static void zzb(StringBuilder sb, int i10, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i10, sb);
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
            sb.append(zzpg.zza(new zzlc(((String) obj).getBytes(zznl.zza))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzle) {
            sb.append(": \"");
            sb.append(zzpg.zza((zzle) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zznd) {
            sb.append(" {");
            zzd((zznd) obj, sb, i10 + 2);
            sb.append("\n");
            zzc(i10, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i12, "key", entry.getKey());
        zzb(sb, i12, "value", entry.getValue());
        sb.append("\n");
        zzc(i10, sb);
        sb.append("}");
    }

    private static void zzc(int i10, StringBuilder sb) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzd(zzoi zzoiVar, StringBuilder sb, int i10) throws SecurityException {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzoiVar.getClass().getDeclaredMethods();
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
                zzb(sb, i10, strSubstring.substring(0, strSubstring.length() - 4), zznd.zzE(method2, zzoiVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i10, strSubstring.substring(0, strSubstring.length() - 3), zznd.zzE(method, zzoiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzE = zznd.zzE(method4, zzoiVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzE instanceof Boolean) {
                            if (((Boolean) objZzE).booleanValue()) {
                                zzb(sb, i10, strSubstring, objZzE);
                            }
                        } else if (objZzE instanceof Integer) {
                            if (((Integer) objZzE).intValue() != 0) {
                            }
                        } else if (objZzE instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzE).floatValue()) != 0) {
                            }
                        } else if (!(objZzE instanceof Double)) {
                            if (objZzE instanceof String) {
                                zEquals = objZzE.equals("");
                            } else if (objZzE instanceof zzle) {
                                zEquals = objZzE.equals(zzle.zzb);
                            } else if (objZzE instanceof zzoi) {
                                if (objZzE != ((zzoi) objZzE).zzm()) {
                                }
                            } else if (!(objZzE instanceof Enum) || ((Enum) objZzE).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzE).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) zznd.zzE(method5, zzoiVar, new Object[0])).booleanValue()) {
                    }
                }
            }
            i11 = 3;
        }
        if (zzoiVar instanceof zzna) {
            Iterator itZzf = ((zzna) zzoiVar).zzb.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb, i10, ad.b.b(((zznb) entry2.getKey()).zza, "[", "]"), entry2.getValue());
            }
        }
        zzpm zzpmVar = ((zznd) zzoiVar).zzc;
        if (zzpmVar != null) {
            zzpmVar.zzi(sb, i10);
        }
    }
}
