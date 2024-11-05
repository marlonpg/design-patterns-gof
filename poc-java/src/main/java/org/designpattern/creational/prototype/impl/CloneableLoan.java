package org.designpattern.creational.prototype.impl;

import org.designpattern.creational.abstractfactory.impl.Loan;

public interface CloneableLoan extends Loan {
    CloneableLoan clone();
}
