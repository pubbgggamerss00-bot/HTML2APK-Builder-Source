package q2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f21770a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f21770a == ((i) obj).f21770a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21770a);
    }

    public final String toString() {
        int i10 = this.f21770a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
