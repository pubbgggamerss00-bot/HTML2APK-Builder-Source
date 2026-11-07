package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.g0;
import androidx.fragment.app.y;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a extends g0 implements y.l {

    /* renamed from: p, reason: collision with root package name */
    public final y f1058p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1059q;

    /* renamed from: r, reason: collision with root package name */
    public int f1060r;

    public a(y yVar) {
        yVar.E();
        s<?> sVar = yVar.f1248t;
        if (sVar != null) {
            sVar.f1222t.getClassLoader();
        }
        this.f1109a = new ArrayList<>();
        this.f1122o = false;
        this.f1060r = -1;
        this.f1058p = yVar;
    }

    @Override // androidx.fragment.app.y.l
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (y.H(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1115g) {
            return true;
        }
        y yVar = this.f1058p;
        if (yVar.f1234d == null) {
            yVar.f1234d = new ArrayList<>();
        }
        yVar.f1234d.add(this);
        return true;
    }

    public final void c(int i6) {
        ArrayList<g0.a> arrayList = this.f1109a;
        if (this.f1115g) {
            if (y.H(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i6);
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                g0.a aVar = arrayList.get(i7);
                k kVar = aVar.f1124b;
                if (kVar != null) {
                    kVar.I += i6;
                    if (y.H(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1124b + " to " + aVar.f1124b.I);
                    }
                }
            }
        }
    }

    public final int d(boolean z6) {
        if (this.f1059q) {
            throw new IllegalStateException("commit already called");
        }
        if (y.H(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new i0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1059q = true;
        boolean z7 = this.f1115g;
        y yVar = this.f1058p;
        if (z7) {
            this.f1060r = yVar.f1238i.getAndIncrement();
        } else {
            this.f1060r = -1;
        }
        yVar.w(this, z6);
        return this.f1060r;
    }

    public final void e(int i6, k kVar, String str, int i7) {
        String str2 = kVar.f1185c0;
        if (str2 != null) {
            i1.b.c(kVar, str2);
        }
        Class<?> cls = kVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = kVar.P;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + kVar + ": was " + kVar.P + " now " + str);
            }
            kVar.P = str;
        }
        if (i6 != 0) {
            if (i6 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + kVar + " with tag " + str + " to container view with no id");
            }
            int i8 = kVar.N;
            if (i8 != 0 && i8 != i6) {
                throw new IllegalStateException("Can't change container ID of fragment " + kVar + ": was " + kVar.N + " now " + i6);
            }
            kVar.N = i6;
            kVar.O = i6;
        }
        b(new g0.a(i7, kVar));
        kVar.J = this.f1058p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z6) {
        String str2;
        ArrayList<g0.a> arrayList = this.f1109a;
        if (z6) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1060r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1059q);
            if (this.f1114f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1114f));
            }
            if (this.f1110b != 0 || this.f1111c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1110b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1111c));
            }
            if (this.f1112d != 0 || this.f1113e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1112d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1113e));
            }
            if (this.f1116i != 0 || this.f1117j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1116i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1117j);
            }
            if (this.f1118k != 0 || this.f1119l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1118k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1119l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            g0.a aVar = arrayList.get(i6);
            switch (aVar.f1123a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1123a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i6);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1124b);
            if (z6) {
                if (aVar.f1126d != 0 || aVar.f1127e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1126d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1127e));
                }
                if (aVar.f1128f != 0 || aVar.f1129g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1128f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f1129g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1060r >= 0) {
            sb.append(" #");
            sb.append(this.f1060r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
