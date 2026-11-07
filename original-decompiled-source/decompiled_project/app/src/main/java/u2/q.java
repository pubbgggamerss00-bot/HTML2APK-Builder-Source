package u2;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class q implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f29220a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29221b;

    /* renamed from: c, reason: collision with root package name */
    public int f29222c = 0;

    public q(CharSequence charSequence, int i10) {
        this.f29220a = charSequence;
        this.f29221b = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f29222c;
        if (i10 == this.f29221b) {
            return (char) 65535;
        }
        return this.f29220a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f29222c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f29221b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f29222c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f29221b;
        if (i10 == 0) {
            this.f29222c = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f29222c = i11;
        return this.f29220a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f29222c + 1;
        this.f29222c = i10;
        int i11 = this.f29221b;
        if (i10 < i11) {
            return this.f29220a.charAt(i10);
        }
        this.f29222c = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f29222c;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f29222c = i11;
        return this.f29220a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f29221b || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f29222c = i10;
        return current();
    }
}
