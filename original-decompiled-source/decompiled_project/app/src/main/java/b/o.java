package b;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements sd.d {
    public static String a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static ASN1ObjectIdentifier c(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    @Override // sd.d
    public Object b(sd.z zVar) {
        return ExecutorsRegistrar.f6872a.get();
    }
}
