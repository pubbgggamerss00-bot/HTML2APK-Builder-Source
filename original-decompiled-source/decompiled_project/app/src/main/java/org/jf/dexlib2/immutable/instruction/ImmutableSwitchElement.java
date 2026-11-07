package org.jf.dexlib2.immutable.instruction;

import java.util.List;
import nc.r;
import org.jf.dexlib2.iface.instruction.SwitchElement;
import org.jf.util.ImmutableConverter;

/* loaded from: classes3.dex */
public class ImmutableSwitchElement implements SwitchElement {
    private static final ImmutableConverter<ImmutableSwitchElement, SwitchElement> CONVERTER = new ImmutableConverter<ImmutableSwitchElement, SwitchElement>() { // from class: org.jf.dexlib2.immutable.instruction.ImmutableSwitchElement.1
        @Override // org.jf.util.ImmutableConverter
        public boolean isImmutable(SwitchElement switchElement) {
            return switchElement instanceof ImmutableSwitchElement;
        }

        @Override // org.jf.util.ImmutableConverter
        public ImmutableSwitchElement makeImmutable(SwitchElement switchElement) {
            return ImmutableSwitchElement.of(switchElement);
        }
    };
    protected final int key;
    protected final int offset;

    public ImmutableSwitchElement(int i10, int i11) {
        this.key = i10;
        this.offset = i11;
    }

    public static r<ImmutableSwitchElement> immutableListOf(List<? extends SwitchElement> list) {
        return CONVERTER.toList(list);
    }

    public static ImmutableSwitchElement of(SwitchElement switchElement) {
        return switchElement instanceof ImmutableSwitchElement ? (ImmutableSwitchElement) switchElement : new ImmutableSwitchElement(switchElement.getKey(), switchElement.getOffset());
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchElement
    public int getKey() {
        return this.key;
    }

    @Override // org.jf.dexlib2.iface.instruction.SwitchElement
    public int getOffset() {
        return this.offset;
    }
}
