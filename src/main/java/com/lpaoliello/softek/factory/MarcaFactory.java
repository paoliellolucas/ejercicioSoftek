package com.lpaoliello.softek.factory;

import com.lpaoliello.softek.model.Marca;

public interface MarcaFactory {
	Marca getMarcaInstance(String marca);
}
