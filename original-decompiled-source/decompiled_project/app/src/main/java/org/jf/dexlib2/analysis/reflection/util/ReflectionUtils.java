package org.jf.dexlib2.analysis.reflection.util;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import kf.a;
import nc.o;
import nc.t0;

/* loaded from: classes3.dex */
public class ReflectionUtils {
    private static o<String, String> primitiveMap;

    static {
        o.a aVar = new o.a(4);
        aVar.d("boolean", "Z");
        aVar.d("int", "I");
        aVar.d("long", "J");
        aVar.d("double", a.f16304c);
        aVar.d("void", "V");
        aVar.d("float", "F");
        aVar.d("char", "C");
        aVar.d("short", a.f16303b);
        aVar.d("byte", "B");
        primitiveMap = aVar.c();
    }

    public static String dexToJavaName(String str) {
        return str.charAt(0) == '[' ? str.replace('/', '.') : ((t0) primitiveMap).f18751h.containsKey(str) ? (String) ((t0) primitiveMap).f18751h.get(str) : str.replace('/', '.').substring(1, str.length() - 2);
    }

    public static String javaToDexName(String str) {
        if (str.charAt(0) == '[') {
            return str.replace('.', '/');
        }
        if (primitiveMap.containsKey(str)) {
            return primitiveMap.get(str);
        }
        return i.f7029u + str.replace('.', '/') + ';';
    }
}
