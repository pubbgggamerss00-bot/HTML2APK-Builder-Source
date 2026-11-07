package v2;

import c5.p;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f30551a;

    /* renamed from: b, reason: collision with root package name */
    public final BreakIterator f30552b;

    public e(CharSequence charSequence) {
        this.f30551a = charSequence;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f30552b = characterInstance;
    }

    @Override // c5.p
    public final int X(int i10) {
        return this.f30552b.following(i10);
    }

    @Override // c5.p
    public final int a0(int i10) {
        return this.f30552b.preceding(i10);
    }
}
