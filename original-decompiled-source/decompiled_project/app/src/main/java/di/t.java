package di;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8076a = 0;

    public static final r a(Number number, String output) {
        kotlin.jvm.internal.r.e(output, "output");
        return new r("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(output, -1)));
    }

    public static final r b(bi.f keyDescriptor) {
        kotlin.jvm.internal.r.e(keyDescriptor, "keyDescriptor");
        return new r("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final p c(int i10, CharSequence input, String message) {
        kotlin.jvm.internal.r.e(message, "message");
        kotlin.jvm.internal.r.e(input, "input");
        return d(i10, message + "\nJSON input: " + ((Object) g(input, i10)));
    }

    public static final p d(int i10, String message) {
        kotlin.jvm.internal.r.e(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        return new p(message);
    }

    public static final void e(n0 n0Var, String str) {
        n0Var.m(n0Var.f8056a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void f(n0 n0Var) {
        e(n0Var, "object");
        throw null;
    }

    public static final CharSequence g(CharSequence charSequence, int i10) {
        kotlin.jvm.internal.r.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                String str = i11 <= 0 ? "" : ".....";
                String str2 = i12 >= charSequence.length() ? "" : ".....";
                StringBuilder sbA = k1.q.a(str);
                if (i11 < 0) {
                    i11 = 0;
                }
                int length = charSequence.length();
                if (i12 > length) {
                    i12 = length;
                }
                sbA.append(charSequence.subSequence(i11, i12).toString());
                sbA.append(str2);
                return sbA.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static jh.d h(float f10, float f11) {
        return new jh.d(f10, f11);
    }

    public static final void i(n0 n0Var, Number number) {
        n0.n(n0Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String j(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(str2, -1));
    }
}
