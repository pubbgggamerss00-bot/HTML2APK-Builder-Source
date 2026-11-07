package c5;

import android.util.Log;
import c5.b0;
import c5.j0;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends j0 implements b0.l {

    /* renamed from: p, reason: collision with root package name */
    public final b0 f4760p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4761q;

    /* renamed from: r, reason: collision with root package name */
    public int f4762r;

    public a(b0 b0Var) {
        b0Var.D();
        t<?> tVar = b0Var.f4798u;
        if (tVar != null) {
            tVar.f4980b.getClassLoader();
        }
        this.f4919a = new ArrayList<>();
        this.f4933o = false;
        this.f4762r = -1;
        this.f4760p = b0Var;
    }

    @Override // c5.b0.l
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (b0.G(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4925g) {
            return true;
        }
        b0 b0Var = this.f4760p;
        if (b0Var.f4781d == null) {
            b0Var.f4781d = new ArrayList<>();
        }
        b0Var.f4781d.add(this);
        return true;
    }

    public final void c(int i10) {
        ArrayList<j0.a> arrayList = this.f4919a;
        if (this.f4925g) {
            if (b0.G(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                j0.a aVar = arrayList.get(i11);
                h hVar = aVar.f4935b;
                if (hVar != null) {
                    hVar.f4888s += i10;
                    if (b0.G(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4935b + " to " + aVar.f4935b.f4888s);
                    }
                }
            }
        }
    }

    public final int d(boolean z10) {
        if (this.f4761q) {
            throw new IllegalStateException("commit already called");
        }
        if (b0.G(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new l0());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f4761q = true;
        boolean z11 = this.f4925g;
        b0 b0Var = this.f4760p;
        if (z11) {
            this.f4762r = b0Var.f4786i.getAndIncrement();
        } else {
            this.f4762r = -1;
        }
        b0Var.w(this, z10);
        return this.f4762r;
    }

    public final void e(int i10, h hVar, String str) {
        String str2 = hVar.N;
        if (str2 != null) {
            d5.b.c(hVar, str2);
        }
        Class<?> cls = hVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = hVar.A;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + hVar + ": was " + hVar.A + " now " + str);
            }
            hVar.A = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + hVar + " with tag " + str + " to container view with no id");
            }
            int i11 = hVar.f4893y;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + hVar + ": was " + hVar.f4893y + " now " + i10);
            }
            hVar.f4893y = i10;
            hVar.f4894z = i10;
        }
        b(new j0.a(1, hVar));
        hVar.f4889t = this.f4760p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        ArrayList<j0.a> arrayList = this.f4919a;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4926h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4762r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4761q);
            if (this.f4924f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4924f));
            }
            if (this.f4920b != 0 || this.f4921c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4920b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4921c));
            }
            if (this.f4922d != 0 || this.f4923e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4922d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4923e));
            }
            if (this.f4927i != 0 || this.f4928j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4927i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4928j);
            }
            if (this.f4929k != 0 || this.f4930l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4929k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4930l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            j0.a aVar = arrayList.get(i10);
            switch (aVar.f4934a) {
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
                    str2 = "cmd=" + aVar.f4934a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4935b);
            if (z10) {
                if (aVar.f4937d != 0 || aVar.f4938e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4937d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4938e));
                }
                if (aVar.f4939f != 0 || aVar.f4940g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4939f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4940g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4762r >= 0) {
            sb.append(" #");
            sb.append(this.f4762r);
        }
        if (this.f4926h != null) {
            sb.append(" ");
            sb.append(this.f4926h);
        }
        sb.append("}");
        return sb.toString();
    }
}
