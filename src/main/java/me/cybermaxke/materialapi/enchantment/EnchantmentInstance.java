/**
 * 
 * This software is part of the MaterialAPI
 * 
 * This api allows plugin developers to create on a easy way custom
 * items with a custom id and recipes depending on them.
 * 
 * MaterialAPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or 
 * any later version.
 *  
 * MaterialAPI is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MaterialAPI. If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package me.cybermaxke.materialapi.enchantment;

import org.bukkit.enchantments.Enchantment;

public class EnchantmentInstance {
	private Enchantment enchantment;
	private int lvl;

	public EnchantmentInstance(Enchantment enchantment, int lvl) {
		this.enchantment = enchantment;
		this.lvl = lvl;
	}
	
	public Enchantment getEnchantment() {
		return this.enchantment;
	}
	
	public int getLvl() {
		return this.lvl;
	}
}