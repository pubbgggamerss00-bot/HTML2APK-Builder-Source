package i4;

import e4.e;
import e4.f;
import e4.g;
import e4.h;
import e4.i;
import e4.j;
import e4.k;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import e4.p;
import e4.q;
import e4.s;
import g4.a;
import g4.c;
import g4.d;
import kotlin.jvm.internal.r;
import mh.t;
import mh.x;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final g a(CharSequence charSequence, String str) throws b {
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new e(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new l(charSequence);
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new j(charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new k(charSequence);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new h(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new i(charSequence);
                }
                break;
        }
        if (!t.p(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new f(charSequence, str);
        }
        int i10 = g4.b.f11467c;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!x.r(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new b();
            }
            int i11 = g4.a.f11466d;
            return a.C0101a.a(str, string);
        } catch (b unused) {
            return new f(string, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final o b(CharSequence charSequence, String errorType) throws b {
        r.e(errorType, "errorType");
        switch (errorType.hashCode()) {
            case -781118336:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new e4.r(charSequence);
                }
                break;
            case -408155724:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new s(charSequence);
                }
                break;
            case -45448328:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new p(charSequence);
                }
                break;
            case 580557411:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new m(charSequence);
                }
                break;
            case 627896683:
                if (errorType.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new e4.t(charSequence);
                }
                break;
            case 1594095913:
                if (errorType.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new q(charSequence);
                }
                break;
        }
        if (!t.p(errorType, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new n(charSequence, errorType);
        }
        int i10 = d.f11469c;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!t.p(errorType, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new b();
            }
            int i11 = c.f11468d;
            return c.a.a(errorType, string);
        } catch (b unused) {
            return new n(string, errorType);
        }
    }
}
